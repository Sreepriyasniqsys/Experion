package com.experion.basicprogrammng;

import java.util.Scanner;

public class ArrayLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String productName[] = new String[5];
		
		
		for(int index=0;index<productName.length;index++) {
			System.out.println("Enter 5 product");
		productName[index] = scanner.nextLine();
		}
		System.out.println("*****PRODUCTS IN STOCK********");
		for(int index=0;index<productName.length;index++) {
			productName[index] = scanner.nextLine();
			System.out.println(productName[index]+"     "+productName[index].length());
			}
		
			
	}

}
