FROM openjdk:21

WORKDIR /app

COPY target/*.jar subjects-service-0.0.1-SNAPSHOT.jar

EXPOSE 8763

CMD ["java", "-jar", "subjects-service-0.0.1-SNAPSHOT.jar"]