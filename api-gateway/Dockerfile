# Use a Maven image with JDK 17 to create a build artifact.
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the working directory
COPY pom.xml .

# Download dependencies without building the project
RUN mvn dependency:go-offline -B

# Copy the project files to the working directory
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Use the official OpenJDK 17 image to run the application
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file from the first stage
COPY --from=build /app/target/api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8060

# Set the startup command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
