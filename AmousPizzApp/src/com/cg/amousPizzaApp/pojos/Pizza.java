package com.cg.amousPizzaApp.pojos;

public class Pizza {
	int code , size , category, price, quantity;

	public Pizza(int code, int size, int category, int price, int quantity) {
		super();
		this.code = code;
		this.size = size;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		
	}

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Pizza(int code2, int small, Address a1, int price2, int quantity2) {
		// TODO Auto-generated constructor stub
	}

	public Pizza(int sum, int i) {
		// TODO Auto-generated constructor stub
	}

	public Pizza(int i, Address a1, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
