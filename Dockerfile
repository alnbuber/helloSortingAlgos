FROM adoptopenjdk/openjdk11
COPY target/algorithms-0.0.1-SNAPSHOT.jar /usr/src/app.jar
WORKDIR /usr/src/
CMD ["java", "-jar", "app.jar"]
