package com.sparkdev.kafka.service;

import com.sparkdev.kafka.dto.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
public class MultipleKafkaConsumer {

    private CountDownLatch countDownLatch1 = new CountDownLatch(5);
    private CountDownLatch countDownLatch2 = new CountDownLatch(5);
    private CountDownLatch countDownLatch3 = new CountDownLatch(5);

    @KafkaListener(id = "id0", topicPartitions = { @TopicPartition(topic = "order_topic", partitions = { "0" }) })
    public void listenPartition1(Order record) {
        System.out.println("Listener Id0, Thread ID: " + Thread.currentThread().threadId());
        System.out.println("Received: " + record);
        countDownLatch1.countDown();
    }

    @KafkaListener(id = "id1", topicPartitions = { @TopicPartition(topic = "order_topic", partitions = { "0" }) })
    public void listenPartition2(Order record) {
        System.out.println("Listener Id1, Thread ID: " + Thread.currentThread().threadId());
        System.out.println("Received: " + record);
        countDownLatch2.countDown();
    }

    @KafkaListener(id = "id2", topicPartitions = { @TopicPartition(topic = "order_topic", partitions = { "0" }) })
    public void listenPartition3(Order record) {
        System.out.println("Listener Id2, Thread ID: " + Thread.currentThread().threadId());
        System.out.println("Received: " + record);
        countDownLatch3.countDown();
    }
}
