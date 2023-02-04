# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#messaging.kafka)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

# spring-boot-kafka-tutorials (about this project)
this repo has all the examples explaining the concepts of apache kafka

* "KafkaProducerConfig" and "KafkaConsumerConfig" has the configuration related to producer and consumer
* "OrderPublisher" controller acts as publisher to kafka topic
* "KafkaConsumer" and "MultipleKafkaConsumer" acts as consumer service classes, which consume the data from topic specified

* "KafkaConsumerConfig" demostrate the concurent message consumption feature (multi thread nature)
* "MultipleKafkaConsumer" demonstrate how to consume messages concurrently from different partitions (multi thread nature)

### Note: before this application is run, please make sure the kafka is up and running.
