const Book = require('../models/bookModel');

// Get all books
exports.getAllBooks = (req, res) => {
  try {
    const books = Book.getAll();
    res.status(200).json({
      status: 'success',
      results: books.length,
      data: {
        books
      }
    });
  } catch (error) {
    res.status(500).json({
      status: 'error',
      message: error.message
    });
  }
};

// Get a book by ID
exports.getBookById = (req, res) => {
  try {
    const book = Book.getById(req.params.id);
    
    if (!book) {
      return res.status(404).json({
        status: 'fail',
        message: 'Book not found'
      });
    }
    
    res.status(200).json({
      status: 'success',
      data: {
        book
      }
    });
  } catch (error) {
    res.status(500).json({
      status: 'error',
      message: error.message
    });
  }
};

// Create a new book
exports.createBook = (req, res) => {
  try {
    const { title, author, isbn, publishedYear } = req.body;
    
    // Basic validation
    if (!title || !author) {
      return res.status(400).json({
        status: 'fail',
        message: 'Title and author are required'
      });
    }
    
    const newBook = Book.create({ title, author, isbn, publishedYear });
    
    res.status(201).json({
      status: 'success',
      data: {
        book: newBook
      }
    });
  } catch (error) {
    res.status(500).json({
      status: 'error',
      message: error.message
    });
  }
};

// Update a book
exports.updateBook = (req, res) => {
  try {
    const updatedBook = Book.update(req.params.id, req.body);
    
    if (!updatedBook) {
      return res.status(404).json({
        status: 'fail',
        message: 'Book not found'
      });
    }
    
    res.status(200).json({
      status: 'success',
      data: {
        book: updatedBook
      }
    });
  } catch (error) {
    res.status(500).json({
      status: 'error',
      message: error.message
    });
  }
};

// Delete a book
exports.deleteBook = (req, res) => {
  try {
    const result = Book.delete(req.params.id);
    
    if (!result) {
      return res.status(404).json({
        status: 'fail',
        message: 'Book not found'
      });
    }
    
    res.status(204).json({
      status: 'success',
      data: null
    });
  } catch (error) {
    res.status(500).json({
      status: 'error',
      message: error.message
    });
  }
};
