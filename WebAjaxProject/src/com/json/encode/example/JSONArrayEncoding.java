/**
 * 
 */
package com.json.encode.example;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**
 * @author vpoli
 *
 */
public class JSONArrayEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
		JSONArrayEncoding jsonArrayEncoding = new JSONArrayEncoding();
		jsonArrayEncoding.jSONEncoding();
		jsonArrayEncoding.jSONEncodingWithList();
		jsonArrayEncoding.jSONEncodingWithStreaming();
		jsonArrayEncoding.jSONEncodingWithListAndStreaming();
		}catch(IOException ioException){
			System.out.println(ioException);
		}

	}
	
	private void jSONEncoding(){
		JSONArray list = new JSONArray();
		list.add("foo");
		list.add(new Integer(100));
		list.add(new Double(1000.21));
		list.add(new Boolean(true));
		list.add(null);
		System.out.println(list);
		System.out.flush();
	}

	private void jSONEncodingWithList()throws IOException{
		JSONArray list = new JSONArray();
		list.add("foo");
		list.add(new Integer(100));
		list.add(new Double(1000.21));
		list.add(new Boolean(true));
		list.add(null);
		StringWriter strOut = new StringWriter();
		list.writeJSONString(strOut);
		String jsonText = strOut.toString();
		System.out.println(jsonText);
	}
	
	private void jSONEncodingWithStreaming()throws IOException{
		JSONArray list = new JSONArray();
		list.add("foo");
		list.add(new Integer(100));
		list.add(new Double(1000.21));
		list.add(new Boolean(true));
		list.add(null);
		StringWriter strOut = new StringWriter();
		list.writeJSONString(strOut);
		String jsonText = strOut.toString();
		System.out.println(jsonText);
	}
	
	private void jSONEncodingWithListAndStreaming()throws IOException{
		LinkedList list = new LinkedList();
		list.add("foo");
		list.add(new Integer(100));
		list.add(new Double(1000.21));
		list.add(new Boolean(true));
		list.add(null);
		StringWriter strOut = new StringWriter();
		JSONValue.writeJSONString(list, strOut);
		String jsonText = strOut.toString();
		System.out.println(jsonText);
	}
}
