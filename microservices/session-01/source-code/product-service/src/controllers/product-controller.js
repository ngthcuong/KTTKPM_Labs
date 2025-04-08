const ProductModel = require("../models/product-model");

const ProductController = {
  createProduct: async (req, res) => {
    const { name, price, description, stock } = req.body;
    if (!name || !price || !description || !stock) {
      return res
        .status(500)
        .json({ status: "error", message: "Thiếu thông tin sản phẩm!" });
    }
    try {
      const result = await ProductModel.createProduct({
        name,
        price,
        description,
        stock,
      });
      return res.json(result);
    } catch (error) {
      console.log("Cannot create a product in controller: ", error);
      return res.status(500).json({ status: "error", message: error });
    }
  },
  getAllProducts: async (req, res) => {
    try {
      const products = await ProductModel.getAllProducts();
      return res.json({ data: products });
    } catch (error) {
      console.log("Cannot get all products in controller: ", error);
      return res.status(500).json({ status: "error", message: error });
    }
  },
};

module.exports = ProductController;
