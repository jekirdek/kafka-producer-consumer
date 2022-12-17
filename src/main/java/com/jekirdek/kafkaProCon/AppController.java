package com.jekirdek.kafkaProCon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
    private KafkaProducer kafkaProducer;
	
	@GetMapping("/produce/message")
	public String produce() {
		
		for(int i = 0; i < 100 ; i++) {
			kafkaProducer.sendMessage("my-topic", "Merhaba Dunya " + i);
		}
		
		return "true";
	}
}
