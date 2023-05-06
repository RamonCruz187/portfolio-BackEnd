FROM amazoncorretto:11-alpine-jdk
MAINTAINER RamonCruz
COPY target/Springboot-0.0.1-SNAPSHOT.jar portfolio-app.jar 
ENTRYPOINT ["java","-jar","/portfolio-app.jar"]
EXPOSE 8080 