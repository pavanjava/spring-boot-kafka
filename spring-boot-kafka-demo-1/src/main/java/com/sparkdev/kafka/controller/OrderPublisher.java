package com.sparkdev.kafka.controller;

import com.sparkdev.kafka.dto.Order;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1")
public class OrderPublisher {

    Logger logger = LoggerFactory.getLogger(OrderPublisher.class.getName());
    @Value(value = "${message.topic.name}")
    private String topic;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public OrderPublisher(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public void publish(@RequestBody Order order) throws ExecutionException, InterruptedException {
        CompletableFuture<SendResult<String, Object>> completableFuture = this.kafkaTemplate.send(topic, order);
        SendResult<String, Object> sendResult = completableFuture.get();
        logger.info("data published to topic: [" + sendResult.getRecordMetadata().topic() + "], " +
                "partition: [" + sendResult.getRecordMetadata().partition() + "], " +
                "with offset: [" + sendResult.getRecordMetadata().offset() + "]");
    }
}
