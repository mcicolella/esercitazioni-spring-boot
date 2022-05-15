package net.emmecilab.rabbitmq.demo.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Publisher {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Scheduled(fixedDelay = 5000)
	public void publishMessage() {
	    String message = "Message published on" + LocalDateTime.now();
	    rabbitTemplate.convertAndSend("test", message);
	}
}
