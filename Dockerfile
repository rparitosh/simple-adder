FROM openjdk:11
COPY target/simple-adder-1.0.jar simple-adder-service.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/simple-adder-service.jar"]