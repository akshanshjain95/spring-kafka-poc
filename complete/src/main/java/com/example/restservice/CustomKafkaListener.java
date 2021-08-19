package com.example.restservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CustomKafkaListener {

    @KafkaListener(topics = {"LOCAL_TOPIC"})
    public void someMethod() {
        System.out.println("==================");
        System.out.println("CONSUMED");
        System.out.println("Thread Id: " + Thread.currentThread().getId());
        System.out.println("==================");
    }
}
