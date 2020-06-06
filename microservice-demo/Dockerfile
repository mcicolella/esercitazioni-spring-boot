FROM maven:3.5-jdk-8-alpine AS build

COPY src /usr/src/microservice-demo/src
COPY pom.xml /usr/src/microservice-demo
RUN mvn -f /usr/src/microservice-demo/pom.xml clean package

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/microservice-demo/target/microservice-demo-0.0.1-SNAPSHOT.jar /usr/microservice-demo/microservice-demo-0.0.1-SNAPSHOT.jar  

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/microservice-demo/microservice-demo-0.0.1-SNAPSHOT.jar"]

