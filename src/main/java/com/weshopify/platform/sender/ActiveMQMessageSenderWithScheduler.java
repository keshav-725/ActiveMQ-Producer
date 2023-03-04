package com.weshopify.platform.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;

public class ActiveMQMessageSenderWithScheduler {
	
	@Autowired
	private JmsTemplate template;

	//using lambda styel anonymous inner class
	@Scheduled(cron = "*/10*****")
	public void sendMessage() {
		template.send("testmq1",ses->ses.createTextMessage("From Sender at "+new Date()));
	}
}
