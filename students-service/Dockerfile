FROM openjdk:21

WORKDIR /app

COPY target/*.jar students-service-0.0.1-SNAPSHOT.jar

EXPOSE 8762

CMD ["java", "-jar", "students-service-0.0.1-SNAPSHOT.jar"]