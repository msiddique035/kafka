package com.example.kafkaproducer.service;

import com.example.kafkaproducer.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishKafkaMessage {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void send(String topicName, String msg) {
        kafkaTemplate.send(topicName, msg);
    }

}
