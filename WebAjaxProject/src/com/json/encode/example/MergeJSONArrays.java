/**
 * 
 */
package com.json.encode.example;

import org.json.simple.JSONArray;

/**
 * @author vpoli
 *
 */
public class MergeJSONArrays {

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
		list2.addAll(list1);
		System.out.print(list2);
	}

}
