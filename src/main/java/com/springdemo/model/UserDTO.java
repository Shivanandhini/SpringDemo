package com.springdemo.model;

public class UserDTO {

	private String yourName = "mr.x";
	private String otherName = "mr.y";

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	@Override
	public String toString() {
		return "UserDTO [yourName=" + yourName + ", otherName=" + otherName + "]";
	}

}
