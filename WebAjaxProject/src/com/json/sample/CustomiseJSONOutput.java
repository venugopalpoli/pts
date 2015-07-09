/**
 * 
 */
package com.json.sample;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;

/**
 * @author vpoli
 *
 */
public class CustomiseJSONOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JSONArray users = new JSONArray();
		users.add(new User(123, "foo1", "secret1"));
		users.add(new User(124, "foo2", "secret2"));
		users.add(new User(125, "\"foo2\"", "secret2"));
		System.out.println(users);
		
		try{
			users = new JSONArray();
			users.add(new User(123, "foo1", "secret1"));
			users.add(new User(124, "foo2", "secret2"));
			users.add(new User(125, "\"foo2\"", "secret2"));
			StringWriter strOut = new StringWriter();
			users.writeJSONString(strOut);
			System.out.println(strOut.toString());
		}catch(IOException ioException){
			System.out.println(ioException);
		}

	}

}
