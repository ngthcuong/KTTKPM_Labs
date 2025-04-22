const Book = require('../models/bookModel');

// Test for getting all books
test('should get all books', () => {
  const books = Book.getAll();
  expect(Array.isArray(books)).toBe(true);
  expect(books.length).toBeGreaterThan(0);
});

// Test for getting a book by ID
test('should get a book by ID', () => {
  const book = Book.getById(1);
  expect(book).toBeDefined();
  expect(book.id).toBe(1);
});

// Test for creating a book
test('should create a new book', () => {
  const bookData = {
    title: 'Test Book',
    author: 'Test Author',
    isbn: '1234567890',
    publishedYear: 2023
  };
  
  const newBook = Book.create(bookData);
  expect(newBook).toBeDefined();
  expect(newBook.title).toBe(bookData.title);
  expect(newBook.author).toBe(bookData.author);
  
  // Verify the book was added to the collection
  const books = Book.getAll();
  const addedBook = books.find(book => book.id === newBook.id);
  expect(addedBook).toBeDefined();
});

// Test for updating a book
test('should update a book', () => {
  const updateData = {
    title: 'Updated Title'
  };
  
  const updatedBook = Book.update(1, updateData);
  expect(updatedBook).toBeDefined();
  expect(updatedBook.title).toBe(updateData.title);
  
  // Verify the book was updated in the collection
  const book = Book.getById(1);
  expect(book.title).toBe(updateData.title);
});

// Test for deleting a book
test('should delete a book', () => {
  const initialBooks = Book.getAll();
  const initialCount = initialBooks.length;
  
  const result = Book.delete(1);
  expect(result).toBe(true);
  
  // Verify the book was removed from the collection
  const books = Book.getAll();
  expect(books.length).toBe(initialCount - 1);
  expect(Book.getById(1)).toBeUndefined();
});
