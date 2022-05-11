FROM maven:3.5-jdk-8-alpine AS build

COPY src /usr/src/demobuild/src
COPY pom.xml /usr/src/demobuild

RUN mvn -f /usr/src/demobuild/pom.xml clean package

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/demobuild/target/demo-1.0-SNAPSHOT.jar /usr/src/demo/demo-1.0-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/src/demo/demo-1.0-SNAPSHOT.jar"]
