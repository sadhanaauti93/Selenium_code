package com.cg.banking.pojos;

public class Transaction {
	int Id,Amount;
	String Status,Type;
	int Date;
	public Transaction(int id, int amount, String status, String type, int i) {
		super();
		Id = id;
		Amount = amount;
		Status = status;
		Type = type;
		Date = i;
	}
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getDate(int i, int j, String string, String string2, int k) {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
