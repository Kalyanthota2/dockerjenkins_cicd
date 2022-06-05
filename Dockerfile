FROM openjdk:11
EXPOSE 9090
ADD target/cicddemo cicddemo
ENTRYPOINT ["java","-jar","/cicddemo.jar"]