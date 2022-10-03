package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.Event;
import com.example.kafkaproducer.service.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/kafka/")
public class ApacheKafkaWebController {

    @Autowired
    private JsonKafkaProducer kafkaProducer;

    // http:localhost:8080/api/v1/kafka/publish?message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Event event){
        kafkaProducer.sendMessage(event);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }



}
