/**
 * 
 */
package com.spring.jms.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author vpoli
 *
 */
public class SampleListener implements MessageListener {

	/* (non-Javadoc)
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
	 */
	@Override
	public void onMessage(Message message) {
		 try {
	           if(message instanceof TextMessage) {
	              System.out.println(this + " : " + ((TextMessage) message).getText());
	           }

	        } catch (JMSException ex){
	           throw new RuntimeException(ex);
	        }
	}

}
