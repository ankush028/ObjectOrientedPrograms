package com.bridgelabz.AddressBook.Repositry;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.AddressBook.Model.PersonInfo;

public class FileConnection {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	PersonInfo p = new PersonInfo();
	File file = new File("AddressBook.json");
	
	public List<PersonInfo> readFile() throws IOException {
		List<PersonInfo> listOf =	mapper.readValue(file,new TypeReference<LinkedList<PersonInfo>>(){});
		return listOf;
	}
	
	@SuppressWarnings("deprecation")
	public void writeFile(List<PersonInfo> listOfPerson) throws IOException {
		
		mapper.defaultPrettyPrintingWriter().writeValue(file,listOfPerson);
	}
}
