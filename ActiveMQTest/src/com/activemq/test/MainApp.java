/**
 * 
 */
package com.activemq.test;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * @author vpoli
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_BROKER_URL);                 
			
			// Create a Connection               
			Connection connection = connectionFactory.createConnection();                
			connection.start();                 
			
			// Create a Session                
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);                 
			
			// Create the destination (Topic or Queue)                
			Destination destination = session.createQueue("TEST.Queue");  
			
			// Create a MessageConsumer from the Session to the Topic or Queue               
			MessageConsumer consumer = session.createConsumer(destination);   
			
			consumer.setMessageListener(new HelloWorldListener());
			connection.setExceptionListener(new HelloWorldListener());
			
			Thread.sleep(1000000);
			
			session.close();                
			connection.close(); 
			
		}catch(Exception exception){
			System.out.println(exception);
		}
	}
}

 class HelloWorldListener implements ExceptionListener, MessageListener {        

	 public synchronized void onException(JMSException ex) {            
		System.out.println("JMS Exception occured.  Shutting down client.");      
	}

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {                    
			TextMessage textMessage = (TextMessage) message;                    
			String text;
			try {
				text = textMessage.getText();
				System.out.println("Received: " + text); 
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                    
		} else {                    
			System.out.println("Received: " + message);               
		} 
	}    
}