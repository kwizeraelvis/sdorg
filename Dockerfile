FROM openjdk:11-alpine

MAINTAINER Iradukunda Josue

WORKDIR /usr/src/app

COPY target/sdorg-0.0.1-SNAPSHOT.jar sdorg.jar

EXPOSE 9094

ENTRYPOINT ["java", "-jar", "sdorg.jar"]