# Customer Management API

This is a Spring Boot application that provides a RESTful API for managing customers. It allows you to perform CRUD (Create, Read, Update, Delete) operations on customer records.

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
   git clone https://github.com/your-username/customer-management-api.git
   ```

2. Navigate to the project directory:
   ```
   cd customer-management-api
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

- `GET /api/customers`: Retrieves all customers.
- `GET /api/customers/{id}`: Retrieves a customer by ID.
- `POST /api/customers`: Creates a new customer.
- `PUT /api/customers/{id}`: Updates an existing customer by ID.
- `DELETE /api/customers/{id}`: Deletes a customer by ID.

## Database Configuration

The application uses an in-memory H2 database for testing purposes. The database is automatically populated with sample data when the application starts.

To access the H2 console, follow these steps:

1. Start the application.
2. Open a web browser and go to `http://localhost:8080/h2-console`.
3. In the H2 console login page, make sure the JDBC URL is set to `jdbc:h2:mem:testdb`.
4. Use the default username `sa` with an empty password.
5. Click on the "Connect" button to access the H2 console.

## Testing

The application includes unit tests for the `CustomerController` and `CustomerService` classes. You can run the tests using the following command:
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
│   │   │       │   └── CustomerController.java
│   │   │       ├── entity/
│   │   │       │   └── Customer.java
│   │   │       ├── repository/
│   │   │       │   └── CustomerRepository.java
│   │   │       ├── service/
│   │   │       │   └── CustomerService.java
│   │   │       └── Application.java
│   │   └── resources/
│   │       ├── application.yml
│   │       └── data.sql
│   └── test/
│       ├── java/
│       │   └── com/bobwares/prompts/
│       │       ├── controller/
│       │       │   └── CustomerControllerTest.java
│       │       └── service/
│       │           └── CustomerServiceTest.java
│       └── resources/
│           └── application-test.yml
├── pom.xml
└── README.md
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).