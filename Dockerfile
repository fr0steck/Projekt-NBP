FROM openjdk:11
ADD target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar demo-0.0.1-SNAPSHOT.jar
