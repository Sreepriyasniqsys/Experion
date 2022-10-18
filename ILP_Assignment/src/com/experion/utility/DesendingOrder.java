package com.experion.utility;

import java.util.Scanner;

public class DesendingOrder {

	public static void main(String[] args) {
		Integer numb[] = new Integer[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		numb[0]  = scanner.nextInt();
		numb[1] = scanner.nextInt();
		numb[2]= scanner.nextInt();
		for(int i =0;i<3;i++)
		{
			if(numb[i]>numb[1])
			{
				if(numb[i]>numb[2])
				{
					System.out.println(numb[i]);
				}
			}
			
		}
		
	}
}
