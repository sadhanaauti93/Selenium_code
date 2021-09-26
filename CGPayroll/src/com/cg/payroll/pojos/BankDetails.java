package com.cg.payroll.pojos;

public class BankDetails {
	int accountNo;
	String bankName,ifsCode;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(String ifsCode) {
		this.ifsCode = ifsCode;
	}
	public BankDetails(int accountNo, String bankName, String ifsCode) {
		super();
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.ifsCode = ifsCode;
	}
	public BankDetails() {
		// TODO Auto-generated constructor stub
	}
}
