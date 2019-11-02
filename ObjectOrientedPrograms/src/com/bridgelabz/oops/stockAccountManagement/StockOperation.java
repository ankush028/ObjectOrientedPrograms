package com.bridgelabz.oops.stockAccountManagement;

import java.util.List;
import java.util.Scanner;

public class StockOperation {
	Scanner sc = new Scanner(System.in);
	public void addStock(List<Stock> listOfStock) {
		do {
		Stock s = new Stock();
		
		System.out.println("Enter the Stock Name");
		s.setStockName(sc.next());
		
		System.out.println("Enter the price of stock share");
		s.setPrice(sc.nextInt());
		
		System.out.println("Enter the number of share");
		s.setNumberOfShare(sc.nextInt());
		listOfStock.add(s);
		System.out.println("if Enter more stock enter true");
		}while(sc.nextBoolean());
		}
	public List<Stock> deleteStock(List<Stock> listOfStock) {
		System.out.println("enter the stock name ");
		String name = sc.next();
		for(int i=0;i<listOfStock.size();i++) {
			if(listOfStock.get(i).getStockName().equals(name)) {
				listOfStock.remove(i);
			}
		}
		return listOfStock;
	}
	public void stockval(List<Stock> listOfstock) {
		System.out.println("Enter the Stock Name");
		String name = sc.next();
		
		for(int i =0;i<listOfstock.size();i++) {
			if(listOfstock.get(i).getStockName().equals(name)) {
				Stock temp = listOfstock.get(i);
				 int value = temp.getPrice()*temp.getNumberOfShare();
				 System.out.println("the value of"+temp.getStockName()+ " is :" +value);
			}
		}
	}
	public void Totstockval(List<Stock> listOfstock) {
		int Total =0;
		for(int i =0;i<listOfstock.size();i++) {
				Stock temp = listOfstock.get(i);
				Total = Total+ temp.getPrice()*temp.getNumberOfShare();
				
		}
		System.out.println("Total value of Stock is "+Total);
	}
}
