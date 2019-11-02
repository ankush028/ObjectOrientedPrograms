package com.bridgelabz.oops.inventorydata;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class InventorydataMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			Inventory data1 = mapper.readValue(new File("Inventory.json"),Inventory[].class)[0];
			Inventory data2 = mapper.readValue(new File("Inventory.json"),Inventory[].class)[1];
			Inventory data3 = mapper.readValue(new File("Inventory.json"),Inventory[].class)[2];
			System.out.println("the value of "+data1.getName()+ "==>>> "+(data1.getPrice()*data1.getWeight()));
			System.out.println("the value of "+data2.getName()+ "==>>> "+(data2.getPrice()*data2.getWeight()));
			System.out.println("the value of "+data3.getName()+ "==>>> "+(data3.getPrice()*data3.getWeight()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
