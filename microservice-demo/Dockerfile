FROM maven:3.8.4-openjdk-11-slim AS build

COPY src /usr/src/microservice-demo/src
COPY pom.xml /usr/src/microservice-demo
RUN mvn -f /usr/src/microservice-demo/pom.xml clean package

FROM openjdk:11-jre-slim-stretch
COPY --from=build /usr/src/microservice-demo/target/microservice-demo-0.0.1-SNAPSHOT.jar /usr/microservice-demo/microservice-demo-0.0.1-SNAPSHOT.jar  

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/microservice-demo/microservice-demo-0.0.1-SNAPSHOT.jar"]

