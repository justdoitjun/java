package com.kbstar.dto;

public class ItemDTO {
	private int id;
	private String name;
	private double price;
	private int qt;
	public ItemDTO() {
	}
	public ItemDTO(int id, String name, double price, int qt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qt = qt;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", qt=" + qt + "]";
	}
}	
