package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwappingWithouttempVariables {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter firstNo");
		int firstNo = scanner.nextInt();
		System.out.println("Enter secondNo");
		int secondNo = scanner.nextInt();
		System.out.println("Before Swapping" + firstNo + " " + secondNo);

		firstNo = firstNo + secondNo;
		secondNo = firstNo - secondNo;
		firstNo = firstNo - secondNo;

		System.out.println("After Swapping" + firstNo + " " + secondNo);

	}

}
