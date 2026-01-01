# PatientManagementSystem
A small microservices project aimed at learning the core concepts of microservices architecture, including API Gateway patterns, inter-service communication, and containerized deployment.

The project is designed for learning and experimentation, not production use.

Architecture
The system follows a microservices architecture with the following components:

API Gateway
Spring Cloud Gateway
Central entry point for all HTTP requests
Handles routing and JWT validation

Auth Service
User authentication
JWT token generation and validation
PostgreSQL database

Patient Service
Patient management (CRUD)
Communicates with Billing Service via gRPC
PostgreSQL database

Billing Service
Manages billing accounts
Exposes gRPC endpoints

Analytics Service
Consumes events (Kafka – optional/learning purpose)

Tech Stack
Java 17
Spring Boot
Spring Cloud Gateway
gRPC
PostgreSQL
Docker & Docker Compose
AWS CDK (Java)
LocalStack (for local AWS simulation)
