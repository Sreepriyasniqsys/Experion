package com.experion.utility;

import java.util.Scanner;



import com.experion.entity.Electronics;
import com.experion.entity.Fabric;
import com.experion.entity.Product;




public class ProductUtility {

	public static void main(String[] args) {

		Product product=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Product , 2.Fabric , 3.Electronics , ");
		int choice = scanner.nextInt();
		if(choice==1)
		{
			product = new Fabric("FC100", "COTTON MATERIALS");
		}
		else if(choice==2)
		{
			product = new Electronics("EC200","AC");
			Fabric fabric =(Fabric)product;
			fabric.ProductExchange();
			fabric.ProductRepair();
			fabric.warrantlyReplacement();
			
	}

}
}

