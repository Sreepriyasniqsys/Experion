package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {

	public static Product createProduct() {      // This function returns the value of productso it is a product type function

		Scanner scanner = new Scanner(System.in);   // scanner class declaration
		System.out.println("Enter Product Code");
		String productCode = scanner.nextLine();

		System.out.println("Enter Product Name");
		String productName = scanner.nextLine();

		System.out.println("Enter Product Description");
		String productDescription = scanner.nextLine();

		System.out.println("Enter Product Price");
		double productPrice = scanner.nextDouble();

		System.out.println("Enter Product Open date");

		String openDate = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter Product Validity Date");
		String validityDate = scanner.nextLine();

		System.out.println("Enter Product Expiry Date");
		String expiryDate = scanner.nextLine();

		System.out.println("Active True or False");
		boolean active = scanner.nextBoolean();

		Product product = new Product(productCode, productName, productDescription, productPrice, openDate,
				validityDate, expiryDate, active);
		
		product.setSerialNo(product.getSerialNo()+1);
		product.setOriginalSerialNo(product.getSerialNo());
		return product;
	}

	public static void displayDetails(ArrayList<Product> productList) {
		System.out.println(
				" Sl No Product Code   Product Name   Product Price   Product Quality   validity Date  Expiry Date  Active");
		for (Product product : productList)
			if(product!=null)
				
			System.out.println(
				product.getOriginalSerialNo()+"     "+product.getSerialNo()+" "+	product.getProductCode() + "   " + product.getProductName() + "  " + product.getProductDescription()
							+ "  " + product.getProductPrice() + "    " + product.getOpenDate() + "   "
							+ product.getValidityDate() + "   " + product.getExpiryDate() + "  " + product.isActive());
	}

}
