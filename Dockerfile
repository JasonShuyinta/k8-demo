FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/k8s-demo.jar k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]