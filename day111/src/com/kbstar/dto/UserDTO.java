package com.kbstar.dto;

public class UserDTO {
	private String id;
	public String pwd;
	public String name;
	private String email;
	private String contact;

	// Constructor
	public UserDTO() {
	}

	public UserDTO(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public UserDTO(String pwd, String name) {
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

//To String

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ "]";
	}
	
	

// Getter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

}
