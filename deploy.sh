#!/bin/bash

# Exit on error
set -e

# Build the project (Optional if using CI/CD)
echo "Building the project..."
mvn clean package

# Build Docker image
echo "Building Docker image..."
docker build -t student-management-system .

# Stop any running container (Optional)
echo "Stopping running container..."
docker stop student-management-system || true
docker rm student-management-system || true

# Run the container
echo "Running the container..."
docker run -d -p 8080:8080 --name student-management-system student-management-system

echo "Deployment successful. Application is running on http://localhost:8080"
