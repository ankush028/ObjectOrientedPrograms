package com.bridgelabz.oops.InventoryManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.oops.inventorydata.Inventory;


public class FileConnector {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	
	File file = new File("Inventory.json");
	
	public List<Inventory> readFile() throws IOException {
		List<Inventory> listOfInven = mapper.readValue(file,new TypeReference<List<Inventory>>(){}); 
		return listOfInven;
	}
	
	
	
	@SuppressWarnings("deprecation")
	public void writeFile(List<Inventory> listOfInven) throws IOException {
		
		mapper.defaultPrettyPrintingWriter().writeValue(file,listOfInven);
		
	}

	
}
