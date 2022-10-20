package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class Bankutility {

	public static void main(String[] args) {
		
//		Account account = new Account ("Womens Savings Account","AC108",10000);
//		AccountService accountService = new AccountService();
//		accountService.depositCash(account, 2000);
//		accountService.depositCash(account, "DE100", 3000);
//		accountService.depositCash(account, "DE100",1000);
		Product product=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account , 2.Card , 3.Loan");
		int choice = scanner.nextInt();
		if(choice==1)
		{
			product = new Account("Womens Savings Account", "WSA100",1000);
		}
		else if(choice==2)
		{
			product = new Card("Pan Card", "PAN100",1000);

		}
		else if(choice==3)
		{
			product = new Loan("Car Loan", "LN100",1000000);

		}
		product.checkProductValidity();
	}
}