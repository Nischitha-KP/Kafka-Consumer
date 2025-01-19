package com.example.KafkaConsumerApplication.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "orders", groupId = "my-group")
    public void listenOrders(String message) {
        System.out.println("Received message in 'orders' topic : " + message);
        // Process the message
    }
    @KafkaListener(topics = "stocks", groupId = "my-group")
    public void listenStocks(String message) {
        System.out.println("Received message in 'stocks' topic: " + message);
        // Process the message
    }
    @KafkaListener(topics = "sales", groupId = "my-group")
    public void listenSales(String message) {
        System.out.println("Received message in 'sales' topic: " + message);
        // Process the message
    }
}

