FROM openjdk:17-alpine
COPY target/simple-adder-1.0.jar simple-adder-1.0.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/simple-adder-1.0.jar"]