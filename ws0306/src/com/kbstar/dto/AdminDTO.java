package com.kbstar.dto;

public class AdminDTO {
	private String id;
	private String pwd;
	private String name;
	private int level;
	public AdminDTO() {
	}
	public AdminDTO(String id, String pwd, String name, int level) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.level = level;
	}
	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", level=" + level + "]";
	}
	
}