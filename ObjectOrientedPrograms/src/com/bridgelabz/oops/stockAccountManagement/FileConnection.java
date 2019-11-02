package com.bridgelabz.oops.stockAccountManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class FileConnection {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	Stock st = new Stock();
	File file = new File("Stock.json");
	
	public List<Stock> readFile() throws IOException {
		
		List<Stock> listOfStock =mapper.readValue(file,new TypeReference<List<Stock>>(){});
		return listOfStock;
		
	}
	
	@SuppressWarnings("deprecation")
	public void writeFile(List<Stock> listOfStock) throws IOException {
		
		mapper.defaultPrettyPrintingWriter().writeValue(file,listOfStock);
	}
}
