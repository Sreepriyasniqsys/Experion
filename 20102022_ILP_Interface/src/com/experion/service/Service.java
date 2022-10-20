package com.experion.service;

import com.experion.entity.Account;

public class Service {
	
	public void depositCash(Account account , double amount)
	{
		System.out.println("depositing money over the counter");
	}
	 public void depositCash(Account account, String depositNumber, double amount )
	 {
			System.out.println("depositing money via cheque");
 
	 }
	 public void depositCash(Account account , double amount, String balance)
	 {
			System.out.println("depositing money via Online transfer");

	 }

}