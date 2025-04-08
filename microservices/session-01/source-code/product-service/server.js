const express = require("express");
const app = express();
const PORT = 3000;

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

const ProductRoutes = require("./src/routes/product-routes");
const pg = require("./src/config/pg-config");

// Test database connection
pg.query("SELECT NOW()", (err, res) => {
  if (err) {
    console.error("Error connecting to the database:", err);
  } else {
    console.log("Database connected successfully");
  }
});

app.use("/api/products", ProductRoutes);

app.use("/", (req, res) => {
  res.send("Server is running!");
});

app.listen(PORT, () => {
  console.log(`Server is running in port: ${3000}, http://localhost:${PORT}`);
});
