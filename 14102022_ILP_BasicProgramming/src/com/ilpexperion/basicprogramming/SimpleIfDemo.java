package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		int numb;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		numb = scanner.nextInt();
		result = numb % 2;
		if ((numb % 2) == 0) {
			System.out.println("Even");
		}

	}

}
