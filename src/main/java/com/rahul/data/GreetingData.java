package com.rahul.data;

import java.io.Serializable;

public class GreetingData implements Serializable {

	private static final long serialVersionUID = 1156774586336208065L;
	
	String greetingMessage;

	public GreetingData(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

}
