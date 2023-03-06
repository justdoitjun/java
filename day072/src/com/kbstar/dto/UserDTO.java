package com.kbstar.dto;

public class UserDTO {
	private String id;
	public String pwd;
	public String name;
	
//Constructor
	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	
	public UserDTO(String pwd, String name) {
		this.pwd = pwd;
		this.name = name;
	}


	public UserDTO() {
	}
	
	
	
//Getter-Setter
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
