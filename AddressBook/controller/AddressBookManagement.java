package com.bridgelabz.AddressBook.controller;


import java.io.IOException;
import java.util.List;
import com.bridgelabz.AddressBook.Model.PersonInfo;
import com.bridgelabz.AddressBook.Repositry.FileConnection;
import com.bridgelabz.AddressBook.Services.Operations;
import com.bridgelabz.AddressBook.Services.Utility;

public class AddressBookManagement {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Operations op = new Operations();
		Utility u = new Utility();
		FileConnection fcon = new FileConnection();
		
		
		
		do {
			System.out.println("1 : Add User");
			System.out.println("2 : Delete User");
			System.out.println("3 :	Print the user Detail by first name");
			System.out.println("4 : Edit UserDetails");
			System.out.println("5 : sort the user by First Name");
			
			int choice = u.inputint();
			switch(choice) {
				case 1:
					List<PersonInfo> listOfPerson = fcon.readFile();
	
					op.addUsers(listOfPerson);
					
					fcon.writeFile(listOfPerson);
					
					break;
				case 2:
					List<PersonInfo> listOfPerson1 = fcon.readFile();
					boolean flag = op.deleteUser(listOfPerson1);
					if(flag == true)
						System.out.println("Data is find and deleted");
					else
						System.out.println("Data is not present in the file");
					fcon.writeFile(listOfPerson1);
					break;
					
				case 3:
					List<PersonInfo> listOfPerson2 =fcon.readFile();
					op.PrintUser(listOfPerson2);
					fcon.writeFile(listOfPerson2);
					break;
				case 4:
					List<PersonInfo> listOfPerson3 =fcon.readFile();
					op.editUser(listOfPerson3);
					fcon.writeFile(listOfPerson3);
					break;
				case 5:
					List<PersonInfo> listOfPerson4 =fcon.readFile();
					List<PersonInfo> sortedList =op.SortUser(listOfPerson4);
					fcon.writeFile(sortedList);
			}
			System.out.println("want to perform more Operation : Enter true");
		}while(u.inputBoolean());
		System.out.println("File is updated");
	}

}
