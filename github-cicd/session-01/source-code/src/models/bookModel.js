// In-memory database for simplicity
let books = [
  {
    id: 1,
    title: 'Clean Code',
    author: 'Robert C. Martin',
    isbn: '9780132350884',
    publishedYear: 2008
  },
  {
    id: 2,
    title: 'Design Patterns',
    author: 'Erich Gamma et al.',
    isbn: '9780201633610',
    publishedYear: 1994
  }
];

class Book {
  constructor(id, title, author, isbn, publishedYear) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.publishedYear = publishedYear;
  }

  static getAll() {
    return books;
  }

  static getById(id) {
    return books.find(book => book.id === parseInt(id));
  }

  static create(bookData) {
    const newId = books.length > 0 ? Math.max(...books.map(book => book.id)) + 1 : 1;
    const newBook = {
      id: newId,
      ...bookData
    };
    books.push(newBook);
    return newBook;
  }

  static update(id, bookData) {
    const index = books.findIndex(book => book.id === parseInt(id));
    if (index === -1) return null;
    
    const updatedBook = { ...books[index], ...bookData };
    books[index] = updatedBook;
    return updatedBook;
  }

  static delete(id) {
    const index = books.findIndex(book => book.id === parseInt(id));
    if (index === -1) return false;
    
    books.splice(index, 1);
    return true;
  }
}

module.exports = Book;
