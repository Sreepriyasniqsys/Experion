package com.bank.entity;

import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Account>arrayList;
	public Customer(String customerName, ArrayList<Account> arrayList) {
		super();
		this.customerName = customerName;
		this.arrayList = arrayList;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getArrayList() {
		return arrayList;
	}
	public void setArrayList(ArrayList<Account> arrayList) {
		this.arrayList = arrayList;
	}

	
	

}
