package com.versionone.queryv1.request.json;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.api.client.util.Key;

public class Query {
	@Key
	private String from;
	@Key
	private Map<String, String> where = new HashMap<String, String>();
	@Key
	private List<String> select = new LinkedList<String>();
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Map<String, String> getWhere() {
		return where;
	}
	public List<String> getSelect() {
		return select;
	}
}
