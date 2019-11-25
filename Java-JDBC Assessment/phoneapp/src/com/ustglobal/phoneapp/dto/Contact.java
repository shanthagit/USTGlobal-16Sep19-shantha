package com.ustglobal.phoneapp.dto;

public class Contact {
	private String name;
	private int number;
	private String group_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGroups() {
		return group_name;
	}
	public void setGroups(String groups) {
		this.group_name = groups;
	}

}
