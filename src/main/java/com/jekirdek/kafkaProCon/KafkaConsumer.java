package com.jekirdek.kafkaProCon;

import java.util.logging.Logger;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	Logger logger = Logger.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "my-topic", groupId = "group1")
    public void processMessage1(String message) {
    	logger.info("Received group1 : " + message);
    }
    
    @KafkaListener(topics = "my-topic", groupId = "group2")
    public void processMessage2(String message) {
    	logger.info("Received group2 : " + message);
    }
}
