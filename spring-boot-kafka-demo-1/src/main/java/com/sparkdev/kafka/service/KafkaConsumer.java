package com.sparkdev.kafka.service;

import com.sparkdev.kafka.dto.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "order_topic", groupId = "sparkdev_consumer_group")
    public void listen(Order order) {
        logger.info("in Listener " + order.toString());
    }
}
