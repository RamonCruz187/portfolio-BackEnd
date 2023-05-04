FROM amazoncorreto:20
MAINTAINER RamonCruz
COPY target/Springboot-0.0.1-SNAPSHOT.jar portfolio-app.jar 
ENTRYPOINT ["java","-jar","/portfolio-app.jar"]