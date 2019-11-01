package com.bridgelabz.AddressBook.Model;

public class PersonInfo {
	private String fname;
	private String lname;
	private long mbno;
	private String address;
	private String city;
	private String state;
	private long zipCode;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public long getMbno() {
		return mbno;
	}
	public long getZipCode() {
		return zipCode;
	}
	
}
