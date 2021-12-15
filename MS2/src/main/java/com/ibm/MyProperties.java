package com.ibm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {
	public MyProperties() {
		System.out.println("Properties object created!" + this.message);
	}
	
	@Value("${message}")
	private String message;
	@Value("${url}")
	private String url;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
