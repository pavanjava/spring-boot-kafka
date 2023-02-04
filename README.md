# spring-boot-kafka-tutorials
this repo has all the examples explaining the concepts of apache kafka

* "KafkaProducerConfig" and "KafkaConsumerConfig" has the configuration related to producer and consumer
* "OrderPublisher" controller acts as publisher to kafka topic
* "KafkaConsumer" and "MultipleKafkaConsumer" acts as consumer service classes, which consume the data from topic specified

* "KafkaConsumerConfig" demostrate the concurent message consumption feature (multi thread nature)
* "MultipleKafkaConsumer" demonstrate how to consume messages concurrently from different partitions (multi thread nature)

### Note: before this application is run, please make sure the kafka is up and running.
