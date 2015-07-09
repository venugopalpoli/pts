/**
 * 
 */
package com.json.decode.example;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author vpoli
 * 
 */
public class KeyFinderMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String jsonText = "{\"first\": 123, \"second\": [{\"k1\":{\"id\":\"id1\"}}, 4, 5, 6, {\"id\": 123}], \"third\": 789, \"id\": null}";
		JSONParser parser = new JSONParser();
		KeyFinder finder = new KeyFinder();
		finder.setMatchKey("id");
		try {
			while (!finder.isEnd()) {
				parser.parse(jsonText, finder, true);
				if (finder.isFound()) {
					finder.setFound(false);
					System.out.println("found id:");
					System.out.println(finder.getValue());
				}
			}
		} catch (ParseException pe) {
			pe.printStackTrace();
		}

	}

}
