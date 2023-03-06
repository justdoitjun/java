package com.kbstar.dto;

public class UserDTO {
	private String id;
	private String pwd;
	private String name;
	public UserDTO() {
	}
	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
}