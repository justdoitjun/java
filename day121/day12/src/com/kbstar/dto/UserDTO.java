package com.kbstar.dto;

public class UserDTO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String contact;
	
	public UserDTO() {
	}
	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
		
	public UserDTO(String id, String pwd, String name, String email, String contact) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ "]";
	}
	
	
}
