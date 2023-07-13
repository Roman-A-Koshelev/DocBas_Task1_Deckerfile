FROM maven:3.6.2-jdk-11-slim as builder

WORKDIR /Task1_Dockerfile
COPY pom.xml pom.xml
COPY src ./src/
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim as runtime
WORKDIR /Task1_Dockerfile
ARG DB_URL
ARG DB_USER
ARG DB_PASS

COPY --from=builder /Task1_Dockerfile/target/*.jar Task1_Dockerfile.jar
CMD ["java", "-Xms64M", "-Xmx64M", "-jar", "Task1_Dockerfile.jar"]