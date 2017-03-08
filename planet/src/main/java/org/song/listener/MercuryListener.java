package org.song.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
@Service
public class MercuryListener {
	@RabbitListener(queues = "baibei.queue.Mercury")
	public void listen(Object foo) {
		System.out.println("Mercury receive "+foo.toString());
	}
}
