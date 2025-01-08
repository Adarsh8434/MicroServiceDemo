# MicroServiceDemo

This project demonstrates a set of microservices built with Spring Boot, Maven, and GitHub Actions for continuous integration and deployment. It includes multiple services, such as an API Gateway, Question Service, Quiz Service, and Service Registry. The goal of this project is to show how these services can interact with each other and be deployed as a microservices architecture.

## Technologies Used

- Spring Boot - Framework for building Java-based microservices.
- Maven - Build tool used for project management and dependency management.
- Spring Cloud - Used for building cloud-native applications and microservices.
- MySQL - Database used in the project for storing data.
- Eureka - Service registry for microservices.
- GitHub Packages - Used for storing and distributing the build artifacts.

## Services

This project includes the following services:

### 1.API Gateway
- Acts as the entry point to the microservices.
- Routes requests to appropriate backend services.

### 2.Question Service
- Manages and serves questions for quizzes.
- Allows creation, retrieval, and management of questions.

### 3.Quiz Service
- Manages and serves quizzes based on the questions from the Question Service.
- Handles quiz creation and user quiz interactions.

### 4.Service Registry (Eureka)
- Manages the registration and discovery of services in the microservices architecture.

## Setup and Installation

To get started with this project locally, follow these steps:

### Prerequisites

- Java 17 or higher
- Maven
- MySQL database (configured in `application.properties` for each service)
- Git
- GitHub Account

# Steps

1. Clone the Repository

   Clone this repository to your local machine using the following command:

   ```bash
   git clone https://github.com/Adarsh8434/MicroServiceDemo.git
   cd MicroServiceDemo

2.Setup the MySQL Database

Ensure that you have MySQL running locally or use a remote MySQL database. Update the application.properties file in each service (e.g., QuestionService, QuizService) to point to your database.

Example:
- spring.datasource.url=jdbc:mysql://localhost:3306/microservice_db
- spring.datasource.username=root
- spring.datasource.password=password

3. **Build the Project**

   Navigate to the root of the project and run the following command to build and install all Maven dependencies for all services at once:
   
   ```bash
   mvn clean install

4.Run Services Locally

Run each service using the following command in their respective directories:
      
      mvn spring-boot:run

# Running the Project
Once the services are built, run them as Spring Boot applications. Each service will start independently, and they will register with the service registry (Eureka) so that they can discover each other.

- API Gateway: The entry point for all requests.
- Question Service: Manages questions for quizzes.
- Quiz Service: Manages quizzes and user interactions.
- Service Registry (Eureka): Tracks the status and location of each service.


