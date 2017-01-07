package com.tornado.ecommerce.common.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsernamePasswordDTO {
	
//	@NotNull
//	@Size(min = 2, max = 75, message = "the id must ") 
	private String username;
//	@NotNull
//	@Size(min = 2, max = 75, message = "the id must ") 
	private String password;
	
	@XmlElement
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@XmlElement
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
