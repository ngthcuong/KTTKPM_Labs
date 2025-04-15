const express = require("express");
const { createProxyMiddleware } = require("http-proxy-middleware");
const cors = require("cors");

const app = express();
const PORT = 8080;

app.use(cors());
app.use(express.json());

// Routes & Proxy Configuration
// Product Service Routes
app.use(
  "/api/products",
  createProxyMiddleware({
    target: "http://product-service:8081",
    changeOrigin: true,
    pathRewrite: {
      "^/api/products": "/products",
    },
  })
);

// Order Service Routes
app.use(
  "/api/orders",
  createProxyMiddleware({
    target: "http://order-service:8082",
    changeOrigin: true,
    pathRewrite: {
      "^/api/orders": "/orders",
    },
  })
);

// Customer Service Routes
app.use(
  "/api/customers",
  createProxyMiddleware({
    target: "http://customer-service:8083",
    changeOrigin: true,
    pathRewrite: {
      "^/api/customers": "/customers",
    },
  })
);

// Home route
app.get("/", (req, res) => {
  res.json({
    message: "API Gateway is up and running!",
    services: [
      { name: "Products API", endpoint: "/api/products" },
      { name: "Orders API", endpoint: "/api/orders" },
      { name: "Customers API", endpoint: "/api/customers" },
    ],
  });
});

// Error handling
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).json({ error: "Something went wrong!" });
});

app.listen(PORT, () => {
  console.log(`API Gateway running on port ${PORT}`);
});
