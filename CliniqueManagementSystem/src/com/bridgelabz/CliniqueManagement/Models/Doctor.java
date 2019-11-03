package com.bridgelabz.CliniqueManagement.Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String dname;
	private int did;
	private String Speci;
	private String shift;
	private int appointments;
	
	public int getAppointments() {
		return appointments;
	}

	public void setAppointments(int appointments) {
		this.appointments = appointments;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public String getShift() {
		return shift;
	}

	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getSpeci() {
		return Speci;
	}
	public void setSpeci(String speci) {
		Speci = speci;
	}

	
	
	
}
