/**
 * 
 */
package com.json.decode.example;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author vpoli
 * 
 */
public class TransformerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String jsonString = "{\"name\":\"venu\"}";     
		            
		try {
			JSONParser parser = new JSONParser();     
			Transformer transformer = new Transformer(); 
			transformer.startObjectEntry("name");
			parser.parse(jsonString, transformer);
			Object value = transformer.getResult();
			JSONObject jsonObject = (JSONObject)value;
			System.out.println(jsonObject.toJSONString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException exception){
			exception.printStackTrace();
		}

	}
}
