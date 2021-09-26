package com.cg.banking.pojos;

public class Account {
	int No,Balance;
	String Type;
	public Account(int no, int balance, String type) {
		super();
		No = no;
		Balance = balance;
		Type = type;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
}
