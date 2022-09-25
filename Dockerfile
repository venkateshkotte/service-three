FROM adoptopenjdk/openjdk8

EXPOSE 8082

RUN mkdir -p /tmp/logs/

ADD target/service-three.jar service-three.jar

ENTRYPOINT ["java", "-jar", "service-three.jar"]