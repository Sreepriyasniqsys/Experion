package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankService;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {

		ArrayList<BankService> bankService = new ArrayList<>();
		bankService.add(new BankService ("SCD100","Online Banking"));
		bankService.add(new BankService ("SCD200","Mobile Banking"));
		bankService.add(new BankService ("SCD300","Cash Deposit"));

		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			product = new Card("CARD100", " Cards", "Master Card", "Master");

		} else if (productType.compareTo("Account") == 0) {
			product = new Account("ACC100", "Womens Savings Account", "Accounts", "Savings Accounts", bankService);
		}
		return product;

	}

	public static void displayProductDetails(ArrayList<Product> productList) {
		Card card = null;
		Account account = null;
		
		System.out.println("Product Code" + "  " + "Product Name" + "  " + "Product Type" + "   " + "Account/Card  ");
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product;
				System.out.println(
						card.getProductCode() + "          " + card.getProductName() + "     " + card.getProductType());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(account.getProductCode() + "     " + account.getProductName() + "     "
						+ account.getProductType() );
				
				System.out.println("The list of services are given below :");
				
				for(BankService bankService : account.getBankService())
					
				System.out.println(bankService.getServiceName());
			}
		}
	}

}
