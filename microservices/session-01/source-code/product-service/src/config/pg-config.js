const { Pool } = require("pg");
require("dotenv").config();

const pool = new Pool({
  user: process.env.PG_USER || "postgres",
  host: process.env.PG_HOST || "172.22.0.2",
  database: process.env.PG_DATABASE || "postgres",
  password: process.env.PG_PASSWORD || "postgres",
  port: process.env.PG_PORT || 5433,
});

// Test the connection
pool.connect((err, client, done) => {
  if (err) {
    console.error("Error connecting to PostgreSQL:", err);
  } else {
    console.log("Successfully connected to PostgreSQL");
    done();
  }
});

module.exports = {
  query: (text, params) => pool.query(text, params),
};
