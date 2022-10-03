package com.example.kafkaproducer.service;

import com.example.kafkaproducer.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, Event> kafkaTemplateJson;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(Event data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Event> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, topicJsonName)
                .build();

        kafkaTemplateJson.send(message);
    }

    public void sendMessage(String message) {
            LOGGER.info(String.format("Message sent %s", message));
            kafkaTemplate.send(topicName, message);
    }
}
