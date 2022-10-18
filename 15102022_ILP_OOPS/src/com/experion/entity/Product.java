package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String quality;
	String validityDate;
	String expiryDate;
	boolean active;

	public void inputProductDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code");
		productCode = scanner.nextLine();
		System.out.println("Enter Product Name");
		productName = scanner.nextLine();
		System.out.println("Enter Product Description");
		productDescription = scanner.nextLine();
		System.out.println("Enter Product Price");
		productPrice = scanner.nextDouble();
		System.out.println("Enter Product Quality");
		quality = scanner.nextLine();
		System.out.println("Enter Product Validity Date");
		validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date");
		expiryDate = scanner.nextLine();
		System.out.println("Active True or False");
		active = scanner.hasNext();

	}
	public void displayDetails()
	{
		System.out.println("Product Code   Product Name   Product Price   Product Quality   validity Date  Expiry Date  Active");
		System.out.println(productCode+"   "+productName +"  "+productDescription+"  "+productPrice+"    "+quality+"   "+validityDate+"   "+expiryDate+"  "+"active");
	}
}
