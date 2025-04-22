const express = require("express");
const app = express();
const PORT = 3000;

// Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Routes
const bookRoutes = require("./src/routes/bookRoutes");
app.use("/api/books", bookRoutes);

// Root route
app.get("/", (req, res) => {
  res.json({ message: "Welcome to Book Management API" });
});

// Start server
app.listen(PORT, () => {
  console.log(`Server is running on: http://localhost:${PORT}/`);
});
