package com.kbstar.dto;

public class ItemDTO {
	private String id;
	private String name;
	private double price;
	private int quant;
	public ItemDTO() {
	}
	public ItemDTO(String id, int quant) {
		this.id = id;
		this.quant = quant;
	}
	
	public ItemDTO(String id, String name, double price, int quant) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
	}
	
	
	public String getID() {
		return id;
	}
	
	

}
