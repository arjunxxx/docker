FROM openjdk:21-jdk
MAINTAINER arjun rajeev
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]