package com.deloitte.web.model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		lastName = lastName;
	}
	public boolean authenticate(String username, String passwd){
		if(username!=null && passwd!=null) {
			if(username.equalsIgnoreCase("Nando") && passwd.equals("iambatman")) {
				firstName="Nando";
				lastName="O Nando";
				return true;
			}
		else {
			return false;
			}
		}
		return false;
	}

	

}
