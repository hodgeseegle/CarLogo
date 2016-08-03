package com.chingtech.carlogo.model;

public class DataModel {

	private String key;
	private String value;

	public DataModel() {

	}

	public DataModel(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
