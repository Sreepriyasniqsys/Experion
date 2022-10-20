package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class Bankutility {

	public static void main(String[] args) {
		char mainChoice;
		int choice;
		ArrayList<Product> producList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1.Add Card Products, 2.Add Account Products, 3.Display Products");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				producList.add(Service.createProduct("Cards"));
				break;

			case 2:
				producList.add(Service.createProduct("Account"));
				break;
			case 3:
				Service.displayProductDetails(producList);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue(y/n) -");
			mainChoice = scanner.next().charAt(0);
		} while (choice != 'y');

	}

}
