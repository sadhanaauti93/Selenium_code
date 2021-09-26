package com.cg.banking.main;

import com.cg.banking.pojos.Account;
import com.cg.banking.pojos.Address;
import com.cg.banking.pojos.Customer;
import com.cg.banking.pojos.Nominee;
import com.cg.banking.pojos.Transaction;

public class MainBanking {
public static void main(String[] args) {
	int num = 355;
	
	Customer C = new Customer();
	Customer C1 = new Customer(983417496,25,1,"Sadhana","Auti","01/11/1993","PF/IN/304","sadhanaauti93@gmail.com","Female","job");
	Customer C2 = new Customer();
	System.out.println(C.getFirstName()+" "+C.getFirstName());
	System.out.println(C1.getFirstName()+" "+C1.getFirstName());
	//System.out.println(C2.getFirstName()+" "+C2.getFirstName());

	Address a = new Address();
	Address a1 = new Address(411028,"Satawadi","Sr.no13","ChaurangRencedence","Pune","Maharashtra","India");
	Address a2 = new Address();
	System.out.println(a.getCity()+" "+a.getCity());
	System.out.println(a1.getCountry()+" "+a1.getCountry());
	
	Account Ac = new Account();
	Account Ac1 = new Account(12,132463,"SavingAccount");
	Account Ac2 = new Account();
	System.out.println(Ac.getBalance()+" "+Ac.getBalance());
	System.out.println(Ac1.getType()+" "+Ac1.getType());
	
	Transaction T = new Transaction();
	Transaction T1 = new Transaction(101,2564,"Pass","Savingaccount",15/5/2021);
	Transaction T2 = new Transaction();
	System.out.println(T1.getDate()+" "+T1.getDate());
	System.out.println(T2.getType()+" "+T2.getStatus());

	Nominee N = new Nominee();
	Nominee N1 = new Nominee(21,3665,5008,"Sadhana","Auti","01/11/1993");
	Nominee N2 = new Nominee();
	System.out.println(N1.getAge()+" "+N1.getAdharcard());
	System.out.println(N2.getFirstName()+" "+N2.getMobileNo());
	}
}
