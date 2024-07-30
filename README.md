# BookStore E-Commerce Application

## Project Overview

BookStore is a full-stack e-commerce application developed using Angular for the frontend and Java with Spring Boot for the backend. This project serves as a comprehensive platform for managing books, users, orders, and other essential e-commerce functionalities.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [Scripts](#scripts)
- [License](#license)

## Features

- User authentication & authorization with JWT
- Product management (CRUD operations for books)
- Shopping cart functionality
- Order processing
- Responsive design
- API documentation with Swagger
- Unit testing with JUnit and Jasmine

## Technologies Used

### Backend

- Authentication - Okta
- Java
- Spring Boot
- Hibernate
- MySQL
- JWT (jsonwebtoken)
- Lombok
- Swagger

### Frontend

- Angular
- TypeScript
- RxJS
- Bootstrap
- Angular Material

## Getting Started

To get started with this project, follow these steps:

### Clone the Repository

git clone https://github.com/NedieanuAlexandru/BookStore.git
cd BookStore

## Install Dependencies
## Backend

### 1. Navigate to the backend directory:

cd backend

### 2. Install the necessary dependencies:

mvn install

## Frontend

### 1. Navigate to the frontend directory:

cd ../frontend

### 2. Install the necessary dependencies:

npm install

## Backend Setup

### 1. Create a .env file in the backend directory and add the following environment variables:
   
SPRING_DATASOURCE_URL=your_database_url
SPRING_DATASOURCE_USERNAME=your_database_username
SPRING_DATASOURCE_PASSWORD=your_database_password
JWT_SECRET=your_jwt_secret

### 2. Start the backend server:

mvn spring-boot:run

## Frontend Setup

### 1. Start the development server:

ng serve

### 2. Open your browser and navigate to http://localhost:4200.

## Scripts

### Backend

mvn spring-boot:run: Runs the Spring Boot application.
mvn test: Runs the backend tests using JUnit.

### Frontend
ng serve: Starts the development server.
ng build: Builds the production-ready application.
ng lint: Runs TSLint to check the codebase for potential errors.
ng test: Runs the frontend tests using Jasmine and Karma.

## License
This project is licensed under the MIT License.
