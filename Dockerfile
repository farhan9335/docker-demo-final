FROM openjdk:8
EXPOSE 8085
ADD target/docker-demo-final.jar docker-demo-final.jar
ENTRYPOINT [ "java","-jar","/docker-demo-final.jar" ]