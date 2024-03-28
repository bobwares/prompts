# Prompt-based Customer, Product, and Order Management API

This is a Spring Boot application that provides a RESTful API for managing customers, products, and orders. It allows you to perform CRUD (Create, Read, Update, Delete) operations on customer, product, and order records.

## Technologies Used

- Java 17
- Spring Boot (latest version)
- Spring Framework (latest version)
- Spring Data JPA
- H2 Database (for testing)
- JUnit (latest version)
- Lombok
- Maven

## Getting Started

To run the application locally, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/your-username/customer-product-order-management-api.git
   ```

2. Navigate to the project directory:
   ```
   cd customer-product-order-management-api
   ```

3. Build the application using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

5. The application will start running on `http://localhost:8080`.

## API Endpoints

The following endpoints are available in the API:

### Customer Endpoints

- `GET /api/customers`: Retrieves all customers.
- `GET /api/customers/{id}`: Retrieves a customer by ID.
- `POST /api/customers`: Creates a new customer.
- `PUT /api/customers/{id}`: Updates an existing customer by ID.
- `DELETE /api/customers/{id}`: Deletes a customer by ID.

### Product Endpoints

- `GET /api/products`: Retrieves all products.
- `GET /api/products/{id}`: Retrieves a product by ID.
- `POST /api/products`: Creates a new product.
- `PUT /api/products/{id}`: Updates an existing product by ID.
- `DELETE /api/products/{id}`: Deletes a product by ID.

### Order Endpoints

- `GET /api/orders`: Retrieves all orders.
- `GET /api/orders/{id}`: Retrieves an order by ID.
- `POST /api/orders`: Creates a new order.
- `PUT /api/orders/{id}`: Updates an existing order by ID.
- `DELETE /api/orders/{id}`: Deletes an order by ID.

## JSON Schemas

### Customer JSON Schema

```json
{
   "$schema": "http://json-schema.org/draft-07/schema#",
   "title": "Customer",
   "type": "object",
   "properties": {
      "name": {
         "type": "string"
      },
      "email": {
         "type": "string",
         "format": "email"
      },
      "address": {
         "type": "string"
      }
   },
   "required": [
      "name",
      "email"
   ],
   "additionalProperties": false
}
```

### Product JSON Schema

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "Product",
  "type": "object",
  "properties": {
    "name": {
      "type": "string"
    },
    "description": {
      "type": "string"
    },
    "price": {
      "type": "number",
      "minimum": 0
    },
    "stockQuantity": {
      "type": "integer",
      "minimum": 0
    }
  },
  "required": [
    "name",
    "price",
    "stockQuantity"
  ],
  "additionalProperties": false
}
```

### Order JSON Schema

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "Order",
  "description": "An order placed by a customer for a product",
  "type": "object",
  "properties": {
    "id": {
      "description": "The unique identifier for the order",
      "type": "string"
    },
    "customerId": {
      "description": "The unique identifier for the customer placing the order",
      "type": "string"
    },
    "productId": {
      "description": "The unique identifier for the product ordered",
      "type": "string"
    },
    "quantity": {
      "description": "The quantity of the product ordered",
      "type": "integer",
      "minimum": 1
    }
  },
  "required": [
    "id",
    "customerId",
    "productId",
    "quantity"
  ]
}
```

## Database Configuration

The application uses an in-memory H2 database for testing purposes. The database is automatically populated with sample data when the application starts. To access the H2 console, follow these steps:

1. Start the application.
2. Open a web browser and go to `http://localhost:8080/h2-console`.
3. In the H2 console login page, make sure the JDBC URL is set to `jdbc:h2:mem:testdb`.
4. Use the default username `sa` with an empty password.
5. Click on the "Connect" button to access the H2 console.

## Testing

The application includes unit tests for the `CustomerController`, `CustomerService`, `ProductController`, `ProductService`, `OrderController`, and `OrderService` classes. You can run the tests using the following command:
```
mvn test
```

## Project Structure

The project follows a standard Maven project structure:
```
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/bobwares/prompts/
│   │   │       ├── controller/
│   │   │       │   ├── CustomerController.java
│   │   │       │   ├── ProductController.java
│   │   │       │   └── OrderController.java
│   │   │       ├── entity/
│   │   │       │   ├── Customer.java
│   │   │       │   ├── Product.java
│   │   │       │   └── Order.java
│   │   │       ├── repository/
│   │   │       │   ├── CustomerRepository.java
│   │   │       │   ├── ProductRepository.java
│   │   │       │   └── OrderRepository.java
│   │   │       ├── service/
│   │   │       │   ├── CustomerService.java
│   │   │       │   ├── ProductService.java
│   │   │       │   └── OrderService.java
│   │   │       └── Application.java
│   │   └── resources/
│   │       ├── application.yml
│   │       └── data.sql
│   └── test/
│       ├── java/
│       │   └── com/bobwares/prompts/
│       │       ├── controller/
│       │       │   ├── CustomerControllerTest.java
│       │       │   ├── ProductControllerTest.java
│       │       │   └── OrderControllerTest.java
│       │       └── service/
│       │           ├── CustomerServiceTest.java
│       │           ├── ProductServiceTest.java
│       │           └── OrderServiceTest.java
│       └── resources/
│           └── application-test.yml
├── pom.xml
└── README.md
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).