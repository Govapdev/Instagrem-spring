FROM airdock/oraclejdk:1.8
ADD target/instagrem.jar instagrem.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","instagrem.jar"]