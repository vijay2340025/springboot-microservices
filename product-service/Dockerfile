FROM openjdk:17
EXPOSE 8081
WORKDIR /product-ms
COPY ./target/product-service-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "product-service-0.0.1-SNAPSHOT.jar"]