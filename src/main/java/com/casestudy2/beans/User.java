package com.casestudy2.beans;

public class User{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String emailid;
	private String message;
	
	public User()
	{}
	
	public User(String firstName, String lastName, String userName, String password, String emailid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailid = emailid;
	}
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
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", emailid=" + emailid + "]";
	}

	
	
	
}
