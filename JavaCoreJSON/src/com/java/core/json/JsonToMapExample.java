/**
 * 
 */
package com.java.core.json;

/**
 * @author vpoli
 *
 */
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JsonToMapExample {
	 public static void main(String[] args) {
		 
			try {
		 
				ObjectMapper mapper = new ObjectMapper();
				String json = "";
		 
				Map<String, String> map = new HashMap<String, String>();
				map.put("name", "mkyong");
				map.put("age", "29");
		 
				//convert map to JSON string
				json = mapper.writeValueAsString(map);
		 
				System.out.println(json);
		 
			} catch (Exception e) {
				e.printStackTrace();
			}
		 
		    }

}