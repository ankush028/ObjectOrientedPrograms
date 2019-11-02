package com.bridgelabz.oops.stockAccountManagement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class StockAccountMgmt {

	
	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : addStock");
		System.out.println(" 2: Delete Stock");
		System.out.println("3: value Of each Stock");
		System.out.println("4 : Total Stock value");
		int ch = sc.nextInt();
		StockOperation op = new StockOperation();
		FileConnection fcon = new FileConnection();
		
		do {
			switch(ch) {
			case 1:
				List<Stock> listOfStock =fcon.readFile();
				op.addStock(listOfStock);
				fcon.writeFile(listOfStock);
				break;
				
			case 2:
				List<Stock> listOfStock1 =fcon.readFile();
				op.deleteStock(listOfStock1);
				fcon.writeFile(listOfStock1);
				
				break;
			case 3:
				List<Stock> listOfStock2 =fcon.readFile();
				op.stockval(listOfStock2);
				break;
			case 4:
				List<Stock> listOfStock3 =fcon.readFile();
				op.Totstockval(listOfStock3);
				break;
			}
		System.out.println("If you want to perform more Operation Enter true");
		}while(sc.nextBoolean());
		sc.close();
		System.out.println("Operation has performed");
	}

}
