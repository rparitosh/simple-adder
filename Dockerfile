FROM openjdk:17-alpine
COPY target/simple-adder-1.0.jar adder-service.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/adder-service.jar"]