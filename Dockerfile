# Use an OpenJDK base image


# build
#FROM maven:3.9.6-eclipse-temurin-17   as builder
FROM openjdk:17
ADD /target/dockerExample-0.0.1-SNAPSHOT.jar backend.jar
#WORKDIR /opt/app
#COPY mvnw pom.xml ./
#COPY ./src ./src
#RUN mvn clean install -DskipTests

#start
#FROM eclipce-temurin:17-jre-jammy
#WORKDIR /opt/app
#EXPOSE 8080
#COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
#ENTRYPOINT  ["java", "-jar", "/opt/app/*.jar"]


ENTRYPOINT  ["java", "-jar", "backend.jar"]