package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		int fNo;
		int sNo;
		int tNo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		fNo = scanner.nextInt();
		System.out.println("Enter second number");
		sNo = scanner.nextInt();
		System.out.println("Enter third number");
		tNo = scanner.nextInt();

		if (fNo > sNo) {
			if (fNo > tNo)

				System.out.println(fNo + "is largest");

			else {
				System.out.println(tNo + "is largest");

			}
		} else if (sNo > tNo) {
			System.out.println(sNo + "is largest");

		}

		else {
			System.out.println(tNo + "is largest");

		}

	}
}
