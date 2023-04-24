FROM openjdk:17
MAINTAINER sergey sundukovskiy
COPY target/cs370-final-0.0.1-SNAPSHOT.jar cs370-final-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cs370-final-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080