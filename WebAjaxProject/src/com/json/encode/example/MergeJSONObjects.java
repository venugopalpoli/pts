/**
 * 
 */
package com.json.encode.example;

import org.json.simple.JSONObject;

/**
 * @author vpoli
 *
 */
public class MergeJSONObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONObject obj1 = new JSONObject(); 
		obj1.put("name","foo");
		obj1.put("num",new Integer(100)); 
		obj1.put("balance",new Double(1000.21)); 
		JSONObject obj2 = new JSONObject();
		obj2.put("is_vip",new Boolean(true)); 
		obj2.put("nickname",null);
		obj2.putAll(obj1); 
		System.out.print(obj2);
	}

}
