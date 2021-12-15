FROM adoptopenjdk:11-jre-hotspot-bionic
ADD target/secondservice-0.0.1-SNAPSHOT.jar secondservice-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar" , "secondservice-0.0.1-SNAPSHOT.jar"]
