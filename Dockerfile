# Use the correct base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/DevOps-project-0.0.1-SNAPSHOT.jar

# Expose the application port
EXPOSE 8080

# Define the entry point for the application
ENTRYPOINT ["java", "-jar", "app.jar"]
