#FROM openjdk:8
#ADD target/practice-spring-boot.jar practice-spring-boot.jar
#EXPOSE 5432
#ENTRYPOINT ["java", "-jar", "practice-spring-boot.jar"]

FROM openjdk:8-jdk-alpine
EXPOSE 8080
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=paityn
ENV POSTGRES_DB=practicespringbootdb
ADD target/practice-spring-boot.jar practice-spring-boot.jar
ENTRYPOINT ["java", "-jar", "practice-spring-boot.jar"]
