# Use an official Java runtime as a parent image
FROM openjdk:11-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the local .jar file to the container
COPY target/student-management-system-1.0-SNAPSHOT.jar /app/student-management-system.jar

# Make port 8080 available to the world outside the container
EXPOSE 8080

# Run the .jar file when the container starts
ENTRYPOINT ["java", "-jar", "student-management-system.jar"]
