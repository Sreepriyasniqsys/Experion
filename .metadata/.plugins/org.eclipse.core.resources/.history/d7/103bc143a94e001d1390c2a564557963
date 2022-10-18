package com.canddella.service;

import java.util.Scanner;

import com.canddella.entity.Product;

public class CustomerService {
	
	
	public static  Product buyProduct(Product[] productList)
	{
		Scanner scanner= new Scanner(System.in);
		Product customerSelectedProduct = null;
		System.out.println("Enter the product code  which customer wants to buy");
		String productCode= scanner.nextLine();
		
		
		for(Product product : productList)
		
		{ 
			if(productCode.compareTo(product.getProductCode())==0)
			{
				
				 
				customerSelectedProduct = product;
				break;
			}
		}
		return customerSelectedProduct;	
	}

}
