package com.bridgelabz.oops.InventoryManagement;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.oops.inventorydata.Inventory;

public class InventoryManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : addInventory");
		System.out.println(" 2: Delete Inventory");
		System.out.println("3: value Of each inventory");
		
		int ch = sc.nextInt();
		InventoryOperation op = new InventoryOperation();
		FileConnector fcon = new FileConnector();
		Inventory i = new Inventory();
		
		do {
			switch(ch) {
			case 1:
				
				List<Inventory> listOfIn =fcon.readFile();
				op.addInventory(listOfIn);
				 fcon.writeFile(listOfIn);
				break;
				
			case 2:
				
				List<Inventory> listOfIn1 =fcon.readFile();
				op.deleteInventory(listOfIn1);
				fcon.writeFile(listOfIn1);
				
				break;
			case 3:
				List<Inventory> listOfIn2 =fcon.readFile();
				op.Inventoryval(listOfIn2);
				break;
			}
		System.out.println("If you want to perform more Operation Enter true");
		}while(sc.nextBoolean());
		sc.close();
		System.out.println("Operation has performed");
	}
}


