package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Stock;
import com.experion.service.Service;

public class StockUtility {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		//Stock[] stock1 = null;
		System.out.println("1.Stock Updation 2. Display Stock");
		System.out.println("Enter choice");
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1: Stock[] stock=service.stockUpdation();
		break;
		case 2 : service.displayStock(stock);
		break;
		default :System.out.println("Invalid choice");
		}
	}

}
