package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		int fnumb;
		int snumb;
		int tnumb;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number");
		fnumb = scanner.nextInt();
		System.out.println("Enter Second number");
		snumb = scanner.nextInt();
		System.out.println("Enter third number");
		tnumb = scanner.nextInt();

		if ((fnumb > snumb) && (fnumb > tnumb)) {
			System.out.println(fnumb + "is greatest");

		} else if (snumb > tnumb) {
			System.out.println(snumb + "is greatest");

		}

		else {
			System.out.println(tnumb + "is greatest");
		}

	}

}
