package com.ilpexperion.objectclassbasics;

public class Employee {
	String employeeName = "Sreepriya";
	int employeeAge = 23; // variables declarations
	char employeeGender = 'F';
	double employeeCgpa = 8.4;

	public void displayEmployeeDetails() { // create fun for display
		System.out.println("*******Welcome to ILP Program*********");
		System.out.println("Name" + "  " + "Age" + "  " + "Gender" + " " + "CGPA");
		System.out.println(employeeName + "   " + employeeAge + "     " + employeeGender + "      " + employeeCgpa);

	}
}
