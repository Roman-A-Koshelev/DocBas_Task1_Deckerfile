FROM maven:3.9.3-eclipse-temurin-17 as builder

WORKDIR /Task1_Dockerfile
COPY pom.xml pom.xml
COPY src ./src/
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine as runtime
WORKDIR /Task1_Dockerfile
#ENV DB_URL 'jdbc:postgresql://localhost:5432/db_name'
#ENV DB_USER 'db_username'
#ENV DB_PASS 'db_password'
ARG DB_URL
ARG DB_USER
ARG DB_PASS

COPY --from=builder /Task1_Dockerfile/target/*.jar Task1_Dockerfile.jar
CMD ["java", "-Xms64M", "-Xmx64M", "-jar", "Task1_Dockerfile.jar"]