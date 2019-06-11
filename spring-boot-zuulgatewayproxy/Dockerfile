FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar   /app/music/zuel/spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar
WORKDIR   app/music/zuel
ENTRYPOINT  ["java","-jar", "spring-boot-zuulgatewayproxy-0.0.1-SNAPSHOT.jar"]