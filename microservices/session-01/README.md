# Microservices Architecture

A microservices-based e-commerce system with Product, Order, and Customer services communicating through an API Gateway.

## System Architecture

This project implements a microservices architecture with:

1. **API Gateway**: Central entry point that routes requests to the appropriate services
2. **Product Service**: Manages product information
3. **Order Service**: Handles order processing
4. **Customer Service**: Manages customer data
5. **Database per Service**: Each service has its own MongoDB database

## Technologies Used

- **Backend**: Node.js with Express.js
- **Database**: MongoDB
- **API Gateway**: Express.js with http-proxy-middleware
- **Containerization**: Docker and Docker Compose
- **Communication**: REST API

## Project Structure

```
microservices/
├── api-gateway/
│   ├── Dockerfile
│   ├── package.json
│   └── server.js
├── product-service/
│   ├── Dockerfile
│   ├── package.json
│   ├── server.js
│   ├── models/
│   │   └── Product.js
│   └── routes/
│       └── productRoutes.js
├── order-service/
│   ├── Dockerfile
│   ├── package.json
│   ├── server.js
│   ├── models/
│   │   └── Order.js
│   └── routes/
│       └── orderRoutes.js
├── customer-service/
│   ├── Dockerfile
│   ├── package.json
│   ├── server.js
│   ├── models/
│   │   └── Customer.js
│   └── routes/
│       └── customerRoutes.js
├── docker-compose.yml
├── service-diagram.md
└── README.md
```

## Prerequisites

- Docker and Docker Compose installed
- Node.js (for local development)

## How to Run

1. Clone the repository:

   ```
   git clone [repository-url]
   cd microservices
   ```

2. Build and start the services using Docker Compose:

   ```
   docker-compose up --build
   ```

3. The services will be available at:
   - API Gateway: http://localhost:8080
   - Product Service: http://localhost:8081
   - Order Service: http://localhost:8082
   - Customer Service: http://localhost:8083

## API Endpoints

### Product Service

- `GET /api/products` - Get all products
- `GET /api/products/:id` - Get a specific product
- `POST /api/products` - Create a new product
- `PUT /api/products/:id` - Update a product
- `DELETE /api/products/:id` - Delete a product

### Order Service

- `GET /api/orders` - Get all orders
- `GET /api/orders/:id` - Get a specific order
- `GET /api/orders/customer/:customerId` - Get orders by customer
- `POST /api/orders` - Create a new order
- `PUT /api/orders/:id` - Update an order
- `DELETE /api/orders/:id` - Delete an order

### Customer Service

- `GET /api/customers` - Get all customers
- `GET /api/customers/:id` - Get a specific customer
- `POST /api/customers` - Create a new customer
- `PUT /api/customers/:id` - Update a customer
- `DELETE /api/customers/:id` - Delete a customer

## Development

For local development of individual services:

1. Navigate to the service directory:

   ```
   cd [service-name]
   ```

2. Install dependencies:

   ```
   npm install
   ```

3. Start the service in development mode:
   ```
   npm run dev
   ```
