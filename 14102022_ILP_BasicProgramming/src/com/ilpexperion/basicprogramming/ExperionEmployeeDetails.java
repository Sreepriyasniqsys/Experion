package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetails {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("*******Welcome to ILP Program*********");

		System.out.println("Enter your Employee Name");
		String employeeName = scanner.next();
		System.out.println("Enter your Employee Age");
		int employeeAge = scanner.nextInt();
		System.out.println("Enter your Employee Gender");
		char employeeGender = scanner.next().charAt(0);
		System.out.println("Enter your Employee CGPA");
		double employeeCgpa = scanner.nextDouble();
		System.out.println("*********Employee Details****************");
		System.out.println("Name" + "  " + "Age" + "  " + "Gender" + " " + "CGPA");
		System.out.println(employeeName + "   " + employeeAge + "     " + employeeGender + "      " + employeeCgpa);

	}

}
