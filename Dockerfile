FROM maven:3.8.6-jdk-8-slim AS BUILD
COPY pom.xml /tmp/
COPY src /tmp/src/WORKDIR /tmp/
RUN mvn package FROM openjdk:8-jdk-alpine
COPY --from=build  /tmp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]