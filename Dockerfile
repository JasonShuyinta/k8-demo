FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]