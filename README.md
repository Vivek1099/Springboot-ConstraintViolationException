# Spring Boot Project: Constraint Violation Exception Handling
This project is a Spring Boot application that demonstrates how to handle constraint violation exceptions while performing basic CRUD (Create, Read, Update, Delete) operations. It utilizes Spring Data JPA for database interactions and MariaDB as the database. The application is designed to provide a clear understanding of managing data integrity and handling exceptions effectively.

## Features

- Basic CRUD operations for managing entities
- Handling of constraint violation exceptions
- Clear and informative error messages
- RESTful API design

## Technologies Used

- `Spring Boot:` Framework for building Java applications
- `Spring Web:` For building web applications
- `Spring Data JPA:` For data access and manipulation
- `MariaDB:` Database for storing application data
- `Spring DevTools:` For enhancing the development experience

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
    git clone https://github.com/Vivek1099/Springboot-ConstraintViolationException.git
2. Build the project:
   ```sh
     mvn clean install
3. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. `Test Endpoint`
  - URL: `/test`
  - Method: GET
  - Description: Test the API to ensure it's running
  - Response: "Test for COnstraint Violation"

2. `Save DATA`
  - URL: `/save`
  - Method: POST
  - Description: Save a new user data record to the database
  - Request Body: json in postman
    ```sh
      {
      "fname":"vishal",
      "lname":"Kumar",
      "phoneno":8903467829
      }

3. `Get All users data`
  - URL: `/show`
  - Method: GET
  - Description: Returns a list of all student data.
  
4. `Retreving data using Name or Id.`
  - URL: `/byname/{fname}{lname}` or `/byid/{userid}`
  - Method: GET
  - Description: Returns a list of all users data.

5. `Updating users data`
  - URL: `/update/{userid}`
  - Method: PUT
  - Description: Updates all fields of data.

6. `Deletion of student data`
  - URL: `/delete/{userid}`
  - Method: DELETE
  - Description: Delete student data of provided id.

### Database Configuration

```sh
spring.datasource.url=jdbc:mariadb://localhost:3306/crud
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Exception Handling

This project includes a global exception handler to manage constraint violation exceptions. When a constraint violation occurs, the application will return a meaningful error response.

Example of Constraint Violation Response
```sh
{
  "timestamp": "2024-10-31T12:00:00.000+00:00",
  "status": 400,
  "error": "Bad Request",
  "message": "Constraint violation: Name must not be null",
  "path": "/api/entities"
}
```

### Project Structure

- UserEntity: Entity class representing a user profile.
- UserRepository: Repository interface for CRUD operations on user profiles.
- UserController: REST controller for handling user-related requests.

## Acknowledgements

I would like to thank the following resources and individuals who made this project possible:

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](http://hibernate.org/)
- [JetBrains](https://www.jetbrains.com/idea/)
- [Stack Overflow](https://stackoverflow.com/)
