/**
 * 
 */
package com.json.encode.example;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * @author vpoli
 *
 */
public class JSONObjectEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			JSONObjectEncoding jsonObjectEncoding = new JSONObjectEncoding();
			jsonObjectEncoding.jSONObjectEncoding();
			jsonObjectEncoding.jSONObjectEncodingWithMap();
			jsonObjectEncoding.jSONObjectEncodingWithStreaming();
			jsonObjectEncoding.jSONObjectEncodingWithMapAndStreaming();
			jsonObjectEncoding.jSONObjectEncodingWithListAndMap();
			jsonObjectEncoding.jSONObjectEncodingWithListAndMapAndStreaming();
		}catch(IOException exception){
			System.out.println(exception);
		}

	}
	
	private void jSONObjectEncoding(){
		JSONObject obj = new JSONObject();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		System.out.println(obj);
		System.out.flush();
	}
	
	private void jSONObjectEncodingWithMap(){
		Map obj = new LinkedHashMap();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		String jsonText = JSONValue.toJSONString(obj);
		System.out.println(jsonText);
	}
	
	private void jSONObjectEncodingWithStreaming()throws IOException{
		JSONObject obj = new JSONObject();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		StringWriter strOut = new StringWriter();
		obj.writeJSONString(strOut);
		String jsonText = strOut.toString();
		System.out.println(jsonText);
	}
	
	private void jSONObjectEncodingWithListAndMap(){
		Map m1 = new LinkedHashMap();
		Map m2 = new HashMap();
		List l1 = new LinkedList();
		m1.put("k11", "v11");
		m1.put("k12", "v12");
		m1.put("k13", "v13");
		m2.put("k21", "v21");
		m2.put("k22", "v22");
		m2.put("k23", "v23");
		l1.add(m1);
		l1.add(m2);
		String jsonString = JSONValue.toJSONString(l1);
		System.out.println(jsonString);
	}
	
	private void jSONObjectEncodingWithMapAndStreaming()throws IOException{
		Map obj = new LinkedHashMap();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		StringWriter strOut = new StringWriter();
		JSONValue.writeJSONString(obj, strOut);
		String jsonText = strOut.toString();
		System.out.println(jsonText);
	}
	
	private void jSONObjectEncodingWithListAndMapAndStreaming()throws IOException{
		StringWriter strOut = new StringWriter();
		JSONObject obj = new JSONObject();
		LinkedHashMap m1 = new LinkedHashMap();
		LinkedList l1 = new LinkedList();
		obj.put("k1", "v1");
		obj.put("k2", m1);
		obj.put("k3", l1);
		m1.put("mk1", "mv1");
		l1.add("lv1");
		l1.add("lv2");
		m1.put("mk2", l1);
		obj.writeJSONString(strOut);
		System.out.println("jsonString:");
		System.out.println(strOut.toString());
		String jsonString = obj.toJSONString();
		System.out.println(jsonString);
	}

}
