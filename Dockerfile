FROM adoptopenjdk/openjdk:8-jdk-alpine-jre

EXPOSE 8080

ADD target/authorizationService-0.0.1-SNAPSHOT.jar myapp.jar

CMD ["java", "-jar", "myapp.jar"]
