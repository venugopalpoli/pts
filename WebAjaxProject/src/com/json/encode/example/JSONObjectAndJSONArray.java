/**
 * 
 */
package com.json.encode.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author vpoli
 *
 */
public class JSONObjectAndJSONArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONArray list1 = new JSONArray();
		list1.add("foo");
		list1.add(new Integer(100));
		list1.add(new Double(1000.21));
		JSONArray list2 = new JSONArray();
		list2.add(new Boolean(true));
		list2.add(null);
		JSONObject obj = new JSONObject();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		obj.put("nickname", null);
		obj.put("list1", list1);
		obj.put("list2", list2);
		System.out.println(obj);
	}

}
