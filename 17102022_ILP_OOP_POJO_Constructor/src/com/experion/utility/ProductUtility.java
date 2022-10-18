package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {

//	     	Service service = new Service(); // only for accessing the fun.
		char mainChoice;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		Product productList[] = new Product[3]; // Array declaration
		do {
			System.out.println("1.Create Product 2.Display Product");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				productList[index] = Service.createProduct();
				break;

			case 2:
				Service.displayDetails(productList);
				break;
			}
			System.out.println("Do you want to continue? (Y/N)");
			mainChoice = scanner.next().charAt(index);

		} while (mainChoice == 'y');

	}
}
