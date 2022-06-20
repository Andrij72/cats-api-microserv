FROM alpine:3.15
RUN apk add openjdk11
COPY target/cats-api-microserv-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]