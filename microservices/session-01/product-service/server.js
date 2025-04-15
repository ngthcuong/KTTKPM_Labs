const express = require("express");
const mongoose = require("mongoose");
const cors = require("cors");
const productRoutes = require("./routes/productRoutes");

const app = express();
const PORT = 8081;
const MONGODB_URI = "mongodb://localhost:27017/productdb";

// Middleware
app.use(cors());
app.use(express.json());

// Connect to MongoDB
mongoose
  .connect(MONGODB_URI)
  .then(() => console.log("Connected to MongoDB"))
  .catch((err) => {
    console.error("Could not connect to MongoDB", err);
    process.exit(1);
  });

// Routes
app.use("/products", productRoutes);

// Health check route
app.get("/health", (req, res) => {
  res.status(200).json({ status: "UP", service: "Product Service" });
});

// Error handling middleware
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).json({ error: "Something went wrong!" });
});

// Start server
app.listen(PORT, () => {
  console.log(`Product Service running on port ${PORT}`);
});
