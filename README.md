

# any-user-management-system-CRUD

## User Management System

### Overview

The User Management System is a simple **CRUD (Create, Read, Update, Delete) API** built with **Spring Boot**. This project can be used as a submodule in any major project requiring user management functionalities.

### Features

- Create a new user
- Retrieve all users
- Retrieve a user by ID
- Update an existing user
- Delete a user

### Technologies Used

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL** (configurable database)

### API Endpoints

| Method | Endpoint            | Description              |
|--------|---------------------|--------------------------|
| POST   | `/user/save`        | Creates a new user       |
| GET    | `/user/getusers`    | Retrieves all users      |
| GET    | `/user/{id}`        | Retrieves a user by ID   |
| PUT    | `/user/update/{id}` | Updates user details     |
| DELETE | `/user/delete/{id}` | Deletes a user by ID     |

