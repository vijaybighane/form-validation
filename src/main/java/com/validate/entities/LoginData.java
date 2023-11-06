package com.validate.entities;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank
//	@Size(min = 2, max = 20, message = "Username must contain 2-20 characters")
	private String userName;
	//@Email
	private String email;
	private boolean checkBox;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isCheckBox() {
		return checkBox;
	}
	public void setCheckBox(boolean checkBox) {
		this.checkBox = checkBox;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + ", checkBox=" + checkBox + "]";
	}
	

}
