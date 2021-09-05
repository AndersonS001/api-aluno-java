FROM openjdk:11.0.7-jre-slim-buster

RUN adduser --system --group spring
USER spring:spring

ARG JAR_FILE=build/libs/apialuno-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]