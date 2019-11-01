package com.bridgelabz.AddressBook.Services;

import java.util.Scanner;

public class Utility {


	Scanner sc = new Scanner(System.in);
	public String inputString() {
		String str = sc.next();
		return str;
	}
	public boolean inputBoolean() {
		boolean flag = sc.nextBoolean();
		return flag;
	}
	public int inputint() {
		int num = sc.nextInt();
		return num;
	}
	public long inputlong() {
		long lon = sc.nextLong();
		return lon;
	}
	
}
