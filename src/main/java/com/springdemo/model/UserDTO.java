package com.springdemo.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDTO {

	@NotBlank(message = " * Username can't be blank ")
	@Size(min = 3, max = 15, message = " * Username should have char between 3-15 ")
	private String yourName;
	private String otherName;

	@AssertTrue(message = " * You have to agree to use our app ")
	private boolean termsAndConditions;

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

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	@Override
	public String toString() {
		return "UserDTO [yourName=" + yourName + ", otherName=" + otherName + "]";
	}

}
