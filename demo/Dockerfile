FROM ubuntu:latest

RUN apt-get update && \
apt-get install -y default-jre awscli && \ 
aws s3 cp s3://umd-demo-bucket/demo-0.0.1-SNAPSHOT.jar myProject.jar

EXPOSE 8080

CMD java -jar myProject.jar
