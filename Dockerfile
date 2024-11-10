#FROM adoptopenjdk/openjdk:8-jdk-alpine-jre
FROM eclipse-temurin:8-jdk-alpine
EXPOSE 8080

ADD target/authorizationService-0.0.1-SNAPSHOT.jar myapp.jar

CMD ["java", "-jar", "myapp.jar"]
