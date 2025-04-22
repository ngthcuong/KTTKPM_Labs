# Book Management API

A simple MVC-based REST API for managing books, built with Node.js and Express.

## Project Structure

```
├── .github
│   └── workflows
│       └── ci-cd.yml
├── src
│   ├── controllers
│   │   └── bookController.js
│   ├── models
│   │   └── bookModel.js
│   ├── routes
│   │   └── bookRoutes.js
│   └── tests
│       └── bookModel.test.js
├── .gitignore
├── package.json
├── package-lock.json
├── README.md
└── server.js
```

## Features

- RESTful API for CRUD operations on books
- MVC architecture
- In-memory data storage (for simplicity)
- Basic validation
- Unit tests with Jest
- CI/CD with GitHub Actions

## API Endpoints

- `GET /api/books` - Get all books
- `GET /api/books/:id` - Get a specific book
- `POST /api/books` - Create a new book
- `PUT /api/books/:id` - Update a book
- `DELETE /api/books/:id` - Delete a book

## Getting Started

### Prerequisites

- Node.js (v14 or higher)
- npm

### Installation

1. Clone the repository
2. Install dependencies:
   ```
   npm install
   ```
3. Start the server:
   ```
   npm start
   ```
   
The server will start on port 3000 by default.

### Testing

Run the tests with:

```
npm test
```

## CI/CD Pipeline

This project includes a GitHub Actions workflow that:

1. Builds and tests the application on multiple Node.js versions
2. Runs linting checks (if ESLint is configured)

The workflow is triggered on pushes and pull requests to the main/master branch.

## License

ISC
