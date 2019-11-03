package com.bridgelabz.CliniqueManagement.Services;

import java.util.List;

import com.bridgelabz.CliniqueManagement.Models.Doctor;
import com.bridgelabz.CliniqueManagement.Models.Patient;

public class Operations {
	
	Utility u = new Utility();
	
	public void addDoctor(List<Doctor> listOfDoctor) {
		
		do {
			Doctor d = new Doctor();
			System.out.println("Enter the doctor name.");
			d.setDname(u.inputString());
			
			System.out.println("Enter the doctor id");
			d.setDid(u.inputint());
			System.out.println("Enter the Doctor speciality");
			d.setSpeci(u.inputString());
			
			System.out.println("Enter the doctor availability ");
			
			d.setShift(u.inputString());
			listOfDoctor.add(d);
			
			System.out.println("if enter one more Doctor Enter true");
			
		}while(u.inputBoolean());
	}
	
	public void addPatient( List<Patient> listOfPatient){
		
		do {	
			Patient p = new Patient();
			
			System.out.println("Enter the patient name");
			p.setName(u.inputString());
			
			System.out.println("Enter the patient id");
			p.setId(u.inputint());
			
			System.out.println("Enter the patient age");
			p.setAge(u.inputint());
			
			System.out.println("Enter the patient mobileno ");
			p.setPmbno(u.inputString());
			
			listOfPatient.add(p);
			
			System.out.println("If more Patient enter true");
		}while(u.inputBoolean());
		
	}
	
	public boolean deleteDoctor(List<Doctor> listOfDoctor) {
		System.out.println("Enter the doctor name");
		String dname = u.inputString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getDname().equals(dname)) {
				listOfDoctor.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean deletePatient(List<Patient> listOfPatient) {
		System.out.println("Enter the Patient name");
		String pname = u.inputString();
		for(int i=0;i<listOfPatient.size();i++) {
			if(listOfPatient.get(i).getName().equals(pname)) {
				listOfPatient.remove(i);
				return true;
			}
		}
		return false;
	}
	

	
}
