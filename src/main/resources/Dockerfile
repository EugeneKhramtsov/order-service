FROM azul/zulu-openjdk:17
WORKDIR /home/jackkarter/study/order-service
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
EXPOSE 8182
ENTRYPOINT ["java","-jar","order-service.jar","--spring.datasource.url=jdbc:postgresql://172.17.0.2:5432/orderdb","--spring.zipkin.base-url=172.17.0.3"]
