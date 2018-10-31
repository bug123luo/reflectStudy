package com.tct.jms.producer;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebTopicSender {

	@Resource
	private JmsTemplate jmsTopicTemplate;
	
	public void sendMessage(Destination destination,final String message) {
		log.info("------------------------------------------------------------");
		log.info("TopicSender 发送消息："+message);
		//设置topic为持久化
		/*jmsTopicTemplate.setPubSubDomain(true);
		jmsTopicTemplate.setDeliveryMode(2);*/
		
		String[] temps=message.split(",");
		for(String str1:temps) {
			log.info(str1);
		}
		log.info("------------------------------------------------------------");

		jmsTopicTemplate.send(destination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage(message);
			}
		});
	}

	public JmsTemplate getJmsTopicTemplate() {
		return jmsTopicTemplate;
	}

	public void setJmsTopicTemplate(JmsTemplate jmsTopicTemplate) {
		this.jmsTopicTemplate = jmsTopicTemplate;
	}

	

}