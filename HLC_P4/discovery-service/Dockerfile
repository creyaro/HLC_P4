FROM openjdk:21

WORKDIR /app

COPY target/*.jar discovery-service-0.0.1-SNAPSHOT.jar

EXPOSE 8761

CMD ["java", "-jar", "discovery-service-0.0.1-SNAPSHOT.jar"]