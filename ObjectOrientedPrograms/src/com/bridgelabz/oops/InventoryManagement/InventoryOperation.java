package com.bridgelabz.oops.InventoryManagement;

import java.util.List;
import java.util.Scanner;
import com.bridgelabz.oops.inventorydata.Inventory;


public class InventoryOperation {
	Scanner sc = new Scanner(System.in);
	
	public void addInventory(List<Inventory> listOfInven) {
		do {
		Inventory i = new Inventory();
		
		System.out.println("Enter the Inventory Name");
		i.setName(sc.next());
		
		System.out.println("Enter the price of Inventory");
		i.setPrice(sc.nextInt());
		
		System.out.println("Enter the weight of Inventory");
		i.setWeight(sc.nextInt());
		
		listOfInven.add(i);
		
		System.out.println("if Enter more Inventory enter true");
		}while(sc.nextBoolean());
		}
	public List<Inventory> deleteInventory(List<Inventory> listOfInven) {
		System.out.println("enter the Inventory name ");
		String name = sc.next();
		for(int i=0;i<listOfInven.size();i++) {
			if(listOfInven.get(i).getName().equals(name)) {
				listOfInven.remove(i);
			}
		}
		return listOfInven;
	}
	public void Inventoryval(List<Inventory> listOfInven) {
		System.out.println("Enter the Stock Name");
		String name = sc.next();
		
		for(int i =0;i<listOfInven.size();i++) {
			if(listOfInven.get(i).getName().equals(name)) {
				Inventory temp = listOfInven.get(i);
				 int value = temp.getPrice()*temp.getWeight();
				 System.out.println("the value of"+temp.getName()+ " is :" +value);
			}
		}
	}
}
