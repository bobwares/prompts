DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
                          id IDENTITY PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          address VARCHAR(255)
);

DROP TABLE IF EXISTS product;

CREATE TABLE product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description VARCHAR(255),
                         price DECIMAL(10, 2) NOT NULL,
                         stock_quantity INT NOT NULL
);

DROP TABLE IF EXISTS orders;

CREATE TABLE orders (
                        id VARCHAR(255) PRIMARY KEY,
                        customer_id VARCHAR(255) NOT NULL,
                        product_id VARCHAR(255) NOT NULL,
                        quantity INT NOT NULL,
                        CONSTRAINT fk_orders_customer FOREIGN KEY (customer_id) REFERENCES customer(id),
                        CONSTRAINT fk_orders_product FOREIGN KEY (product_id) REFERENCES product(id)
);