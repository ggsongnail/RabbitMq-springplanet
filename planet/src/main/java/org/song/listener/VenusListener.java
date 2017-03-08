package org.song.listener;

import org.song.message.AppleMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class VenusListener {
	
	@RabbitListener(queues = "baibei.queue.Venus")
	public void listen(AppleMessage apple) {
		System.out.println("Venus receive "+apple.getColor());
	}
}
