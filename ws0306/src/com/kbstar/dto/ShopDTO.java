package com.kbstar.dto;

public class ShopDTO {
	private String id;
	private String name;
	private String addr;
	private String phone;
	public ShopDTO() {
	}
	public ShopDTO(String id, String name, String addr, String phone) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ShopDTO [id=" + id + ", name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
}
