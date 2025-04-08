const pool = require("../config/pg-config");

const ProductModel = {
  createProduct: async (product) => {
    try {
      const result = await pool.query(
        "INSERT INTO products(name, price, description, stock) VALUES($1, $2, $3, $4) RETURNING *",
        [product.name, product.price, product.description, product.stock]
      );
      return result.rows[0];
    } catch (error) {
      console.log("Cannot create product in model: ", error);
    }
  },
  getAllProducts: async () => {
    try {
      const products = await pool.query("SELECT * FROM products");
      return products.rows;
    } catch (error) {
      console.log("Cannot get all products in model: ", error);
    }
  },
};
module.exports = ProductModel;
