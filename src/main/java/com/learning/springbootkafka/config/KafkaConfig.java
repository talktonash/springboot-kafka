package com.learning.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("topic1")
                .build();
    }

    @Bean
    public NewTopic jsonTopic(){
        return TopicBuilder.name("jsontopic")
                .build();
    }

}
