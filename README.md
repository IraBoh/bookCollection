# Book Collection RESTful API
A simple RESTful API for managing a book collection. This project provides basic operations to retrieve, search, create, update, and delete book information.

## Project Setup with Spring Initializr
This project was set up using [Spring Initializr](https://start.spring.io/), a web-based tool that simplifies the process of creating new Spring Boot applications. 
Spring Initializr allows developers to quickly generate a project structure with the necessary dependencies and configurations.

## Description
Once the application is running, you can access the API at http://localhost:8080/api/books.

This API allows users to manage a collection of books with the following functionalities:
1. Retrieve book details (Get Book)
2. Search for all books
3. Search for books by title and author (Search Books)
4. Create new book entries (Create Book)
5. Update existing book information (Update Book)
6. Delete books from the collection (Delete Book)

## Swagger Documentation
This API is documented using OpenAPI/Swagger. You can access the interactive API documentation through Swagger UI.

### Accessing Swagger UI
Once the application is running, you can view the Swagger UI by navigating to the following URL in your web browser: http://localhost:8080/swagger-ui/index.html

## H2 Database
This API uses an H2 in-memory database for storing book information.

### Features of H2 Database

- **In-Memory Storage**: The H2 database runs entirely in memory, which allows for fast data access and manipulation.
- **Easy Setup**: No complex installation is required; the database is embedded within the application.
- **Web Console**: H2 provides a web-based console for managing the database, allowing you to view and manipulate data easily.

### Accessing the H2 Console
- http://localhost:8080/h2-console
- The connection details can be found in the application.properties file




