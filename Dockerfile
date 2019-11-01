FROM openjdk:8-jdk-alpine

WORKDIR /app

# The application's jar file
ARG JAR_FILE=target/spring-app-configmap-*.jar

# Add the application's jar to the container

ADD ${JAR_FILE} spring-app-configmap.jar

EXPOSE 5959
EXPOSE 5960

ENTRYPOINT ["java", "-jar", "/app/spring-app-configmap.jar"]