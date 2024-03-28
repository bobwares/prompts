DROP TABLE IF EXISTS product;

CREATE TABLE product (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         description VARCHAR(255),
                         price DECIMAL(10, 2) NOT NULL,
                         stock_quantity INT NOT NULL
);

INSERT INTO product (name, description, price, stock_quantity) VALUES
                                                                   ('Product 1', 'Description 1', 9.99, 10),
                                                                   ('Product 2', 'Description 2', 19.99, 20),
                                                                   ('Product 3', 'Description 3', 29.99, 30);