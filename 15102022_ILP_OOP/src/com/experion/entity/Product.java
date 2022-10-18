package com.experion.entity;

import java.util.Scanner;

public class Product {

	private String productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private String openDate;
	private String validityDate;
	private String expiryDate;
	private boolean active;
	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
		
	}
	public String getProductCode()
	{
		return this.productCode;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
		
	}
	public String getProductName()
	{
		return this.productName;
	}
	
	
	

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
		System.out.println("Enter Product Open date");
		openDate = scanner.nextLine();
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
		System.out.println(productCode+"   "+productName +"  "+productDescription+"  "+productPrice+"    "+openDate+"   "+validityDate+"   "+expiryDate+"  "+"active");
	}
}
