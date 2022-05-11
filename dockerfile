FROM maven:3.5-jdk-8-alpine AS build

COPY src /usr/src/demo/src
COPY pom.xml /usr/src/demo

RUN mvn -f /usr/src/demo/pom.xml clean package

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/demo/target/demo-0.0.1-SNAPSHOT.jar /usr/src/demo/demo-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/src/demo/demo-0.0.1-SNAPSHOT.jar"]
