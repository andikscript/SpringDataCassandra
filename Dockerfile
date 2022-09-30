FROM openjdk:8-jdk-alpine
MAINTAINER andik
COPY target/SpringDataCassandra-0.0.1-SNAPSHOT.jar SpringDataCassandra-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringDataCassandra-0.0.1-SNAPSHOT.jar"]