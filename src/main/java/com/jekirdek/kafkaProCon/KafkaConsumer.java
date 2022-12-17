package com.jekirdek.kafkaProCon;

import java.util.logging.Logger;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	Logger logger = Logger.getLogger(KafkaConsumer.class.getName());

    @KafkaListener(topics = "my-topic")
    public void processMessage(String message) {
    	logger.info("Received message: " + message);
    }
}
