package com.cg.amousPizzaApp.pojos;

public class Order {
	int code, amount, timestamp, status;

	public Order(int code, int amount, int timestamp, int status) {
		super();
		this.code = code;
		this.amount = amount;
		this.timestamp = timestamp;
		this.status = status;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int i, int sum) {
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
