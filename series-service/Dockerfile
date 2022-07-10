FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/seriesservice.jar
COPY ${JAR_FILE} seriesservice.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8012