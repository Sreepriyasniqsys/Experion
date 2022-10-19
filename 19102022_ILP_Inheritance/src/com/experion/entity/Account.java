package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {

	private String accountType;
	private ArrayList<BankService>bankService;

	public Account(String productCode, String productName, String productType, String accountType,
			ArrayList<BankService> bankService) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankService = bankService;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ArrayList<BankService> getBankService() {
		return bankService;
	}

	public void setBankService(ArrayList<BankService> bankService) {
		this.bankService = bankService;
	}

}