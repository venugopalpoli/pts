package com.json.sample;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class User implements JSONAware, JSONStreamAware {
	private int id;
	private String name;
	private String password;

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String toJSONString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append(JSONObject.escape("userName"));
		sb.append(":");
		sb.append("\"" + JSONObject.escape(name) + "\"");
		sb.append(",");
		sb.append(JSONObject.escape("ID"));
		sb.append(":");
		sb.append(id);
		sb.append("}");
		return sb.toString();
	}

	@Override
	public void writeJSONString(Writer out) throws IOException {
		LinkedHashMap obj = new LinkedHashMap();
		obj.put("userName", name);
		obj.put("ID", new Integer(id));
		JSONValue.writeJSONString(obj, out);

	}
}
