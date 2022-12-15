package com.learning.springbootkafka.kafka;

import com.learning.springbootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = "jsontopic", groupId = "myGroup")
    public void consume(User user){
    LOGGER.info(String.format("Json Message received -> %s", user));
    }
}
