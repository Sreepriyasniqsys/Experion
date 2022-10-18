package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.Product;
import com.canddella.service.CustomerService;
import com.canddella.service.OfferAvailabilityCheck;
import com.canddella.service.ProductService;

public class ProductCustomerOfferUtility {
	

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		char choiceChar;
		Product[] productList= ProductService.takeStock();
		System.out.println("Enter the no of Product Purchased");
		int quantity = scanner.nextInt();
		do {
			System.out.println("1. Next Customer 2. Sales Report");
			System.out.println("Enter the choice :");
			choice=scanner.nextInt();
			switch(choice)
		
	
		{
		case 1: ProductService.displayStock(productList);
		Product customerSelectProduct=CustomerService.buyProduct(productList);
		boolean offerValidFlag = OfferAvailabilityCheck.isOfferAvailable("06/12/2021", customerSelectProduct);
		ProductService.printBill(offerValidFlag, customerSelectProduct);
		break;
		
		case 2: ProductService.salesReport(productList , quantity);
		break;
		
		
		default: System.out.println("Invalid choice");
		}
		System.out.println("Do you want to Continue......(Y/N):");
				choiceChar = scanner.next().charAt(0);
	}	while(choiceChar !='N');
	}
}

				