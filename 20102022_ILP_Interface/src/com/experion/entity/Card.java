package com.experion.entity;

import com.experion.service.AccountServiceInterface;

public class Card extends Product implements AccountServiceInterface {

	
	private String cardNumber;
	private double cardBalance;
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of Card class called");
	}
	@Override
	public void checkBalance() {
		System.out.println("Balance checked");

	}
	@Override
	public void cashWithdrawl() {
		System.out.println("Cash will be withdrawed");

	}
	
	
	
}


