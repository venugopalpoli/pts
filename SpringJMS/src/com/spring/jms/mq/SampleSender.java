/**
 * 
 */
package com.spring.jms.mq;

import java.util.Calendar;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 * @author vpoli
 *
 */
public class SampleSender {

	/**
     * JMSTemplate.
     */
    private JmsTemplate jmsTemplate;
    
    /**
     * Send a message.
     */
    public void sendMessage()
    {
        jmsTemplate.send(new MessageCreator() {
			
        	@Override
            public Message createMessage(Session session) throws JMSException
            {
                System.out.println("Message Sent");
                final Calendar now = Calendar.getInstance();
                return session.createTextMessage("First Message:");
            }
		});
    }

    /**
     * Sets jmsTemplate to the given value.
     *
     * @param jmsTemplate the jmsTemplate to set
     */
    public void setJmsTemplate(JmsTemplate jmsTemplate)
    {
        this.jmsTemplate = jmsTemplate;
    }

}
