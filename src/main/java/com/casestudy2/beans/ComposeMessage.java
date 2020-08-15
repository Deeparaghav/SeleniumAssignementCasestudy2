package com.casestudy2.beans;

public class ComposeMessage {
	

	private String message;
	public ComposeMessage()
	{}
	
	public ComposeMessage(String message) {
		super();
		this.message = message;
	}
	public String getcomposemsg() {
		return message;
	}
	@Override
	public String toString() {
		return "ComposeMessage [message=" + message + "]";
	}

	public void setcomposemsg(String message) {
		this.message = message;
	}
	
	
}
