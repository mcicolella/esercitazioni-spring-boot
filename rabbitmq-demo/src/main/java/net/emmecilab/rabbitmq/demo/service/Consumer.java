package net.emmecilab.rabbitmq.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "test")
public class Consumer {

	public static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@RabbitHandler
	public void readMessage(String message) {
		logger.warn("From Queue : {}", message);
	}

}
