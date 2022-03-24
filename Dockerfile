#FROM openjdk:11.0.13-jdk
#VOLUME /main-app
#ADD build/libs/web-app-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar","/app.jar"]

FROM openjdk:11.0.13-jdk
COPY build/libs/web-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]