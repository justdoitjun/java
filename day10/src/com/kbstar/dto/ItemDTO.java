package com.kbstar.dto;

import bank.WeirdException;

public class ItemDTO {
	private int id;
	private String name;
	public static double price;
	private int qt;
	//Start of constructor sets.
	public ItemDTO() {
	}
	public ItemDTO(int id, String name, double price, int qt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qt = qt;
	}
	//End of constructor sets.
	
	
	//Start of method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public double setPrice(double price) throws WeirdException{
		this.price = price;
		return price;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", qt=" + qt + "]";
	}
	
}