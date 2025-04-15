const express = require("express");
const router = express.Router();
const Order = require("../models/Order");
const axios = require("axios");

// GET all orders
router.get("/", async (req, res) => {
  try {
    const orders = await Order.find();
    res.json(orders);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
});

// GET one order
router.get("/:id", async (req, res) => {
  try {
    const order = await Order.findById(req.params.id);
    if (!order) {
      return res.status(404).json({ message: "Order not found" });
    }
    res.json(order);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
});

// GET orders by customer ID
router.get("/customer/:customerId", async (req, res) => {
  try {
    const orders = await Order.find({ customerId: req.params.customerId });
    res.json(orders);
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
});

// CREATE an order
router.post("/", async (req, res) => {
  try {
    // Validate customer exists
    try {
      await axios.get(
        `http://customer-service:8083/customers/${req.body.customerId}`
      );
    } catch (error) {
      if (error.response && error.response.status === 404) {
        return res.status(400).json({ message: "Customer not found" });
      }
      console.log("Customer service verification error:", error.message);
    }

    const order = new Order({
      customerId: req.body.customerId,
      items: req.body.items,
      totalAmount: req.body.totalAmount,
      status: req.body.status || "pending",
      shippingAddress: req.body.shippingAddress,
    });

    const newOrder = await order.save();
    res.status(201).json(newOrder);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// UPDATE an order
router.put("/:id", async (req, res) => {
  try {
    const order = await Order.findById(req.params.id);
    if (!order) {
      return res.status(404).json({ message: "Order not found" });
    }

    if (req.body.items) order.items = req.body.items;
    if (req.body.totalAmount) order.totalAmount = req.body.totalAmount;
    if (req.body.status) order.status = req.body.status;
    if (req.body.shippingAddress)
      order.shippingAddress = req.body.shippingAddress;

    const updatedOrder = await order.save();
    res.json(updatedOrder);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// DELETE an order
router.delete("/:id", async (req, res) => {
  try {
    const order = await Order.findById(req.params.id);
    if (!order) {
      return res.status(404).json({ message: "Order not found" });
    }

    await Order.findByIdAndDelete(req.params.id);
    res.json({ message: "Order deleted" });
  } catch (err) {
    res.status(500).json({ message: err.message });
  }
});

module.exports = router;
