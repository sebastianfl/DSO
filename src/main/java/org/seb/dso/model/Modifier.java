package org.seb.dso.model;

public class Modifier {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private String type;
	private String value;
	@Override
	public String toString() {
		return type + "=" + value;
	}

}
