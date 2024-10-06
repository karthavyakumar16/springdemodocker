FROM openjdk:17-jdk-alpine
COPY ./target/javadockerdemo-0.0.1-SNAPSHOT.jar javadockerdemo.jar
ENTRYPOINT ["java","-jar","javadockerdemo.jar"]