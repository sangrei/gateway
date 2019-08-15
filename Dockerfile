FROM sangrei/alpine-oraclejre8:slim
ADD target/gateway-0.1.jar /app.jar
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms64m","-Xmx128m","-jar","app.jar","--server.port=80"]