# Microservices Architecture Project with Spring Boot #

This project demonstrates a microservices architecture using Spring Boot, focusing on managing company departments and employees. It includes components for API Gateway, Service Registry (Eureka), Config Server, Employee Server, and Department Server. The project integrates Zipkin for distributed tracing, WebClient for HTTP communication, and utilizes Docker for containerization.

## Components ##
API Gateway

Routes incoming requests to the appropriate microservice.
Implements routing logic based on predefined predicates.
Service Registry (Eureka)
Utilizes Eureka for service discovery and registration.
Facilitates dynamic routing and load balancing across microservices.
Config Server

Centralizes configuration management using Spring Cloud Config.
Externalizes configuration for microservices, promoting consistency.
Employee Server

Manages CRUD operations for employees.
Utilizes WebClient for interacting with other services.
Department Server

Handles operations related to company departments.
Integrates with Employee Server and employs Zipkin for tracing.
Features
Distributed Tracing with Zipkin

Enables tracing of requests across microservices.
Provides insights into service dependencies and latency.
WebClient Usage

Demonstrates non-blocking HTTP communication with WebClient.
Integrates RESTful APIs between Employee and Department services.
Eureka Discovery

Uses Eureka for service discovery and registration.
Enables dynamic routing and load balancing across instances.
Spring Actuator

Monitors and manages Spring Boot applications.
Provides production-ready features like health checks and metrics.
Docker

Containerizes microservices for easy deployment and scaling.
Simplifies dependency management and ensures consistency across environments.

## Technologies Used ##
Spring Boot 3.3.1
Spring Cloud (API Gateway, Eureka, Config Server)
Zipkin for Distributed Tracing
WebClient for HTTP Communication
Spring Actuator for Monitoring
Docker for Containerization
Java 17
Getting Started
To run the project locally, follow these steps:

Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/microservicesV2-project.git
cd microservices-project
Start the components in the following order:

Config Server
Service Registry (Eureka)
Employee Server
Department Server
API Gateway
Access services through API Gateway:

API Gateway URL: http://localhost:8060
Service URLs: Refer to respective service documentation for endpoints.
Explore tracing data with Zipkin:

Zipkin Dashboard: http://localhost:9411/zipkin/
Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.
