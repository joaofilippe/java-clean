# Java Clean Architecture API

This project demonstrates a simple API using **Clean Architecture** with **Spring Boot**.

## Features
- **User Registration**: Create a new user.
- **User Retrieval**: Fetch user details by ID.

## Technologies
- Java 17
- Spring Boot
- PostgreSQL
- JPA
- Clean Architecture

## Endpoints

### POST /users
Create a user.

### GET /users/{id}
Fetch user by ID.

## Setup

1. Clone repository:
   ```bash
   git clone https://github.com/joaofilippe/java-clean.git
   cd java-clean
   ```

2. Configure PostgreSQL in `application.properties`.

3. Run the app:
   ```bash
   ./gradlew bootRun
   ```
   
