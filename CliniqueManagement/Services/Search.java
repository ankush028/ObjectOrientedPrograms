package com.bridgelabz.CliniqueManagement.Services;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.CliniqueManagement.Models.Doctor;
import com.bridgelabz.CliniqueManagement.Models.Patient;

public class Search {
	Utility u = new Utility();
	//Doctor d = new Doctor();
	LinkedList<Doctor> doclist = new LinkedList<>();
	LinkedList<Patient> patlist = new LinkedList<>();
	
	
	public List<Doctor>  findByname(List<Doctor> listOfDoctor) {
		System.out.println("Enter the doctor name");
		String name = u.inputString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getDname().equals(name)) {
				doclist.add(listOfDoctor.get(i));
			}
		}
		return doclist;
	}
	public List<Doctor>  findByAvailability(List<Doctor> listOfDoctor) {
		System.out.println("Enter the doctor Availability");
		String avail = u.inputString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getShift().equals(avail)) {
				doclist.add(listOfDoctor.get(i));
			}
		}
		return doclist;
	}
	public List<Doctor>  findByspeci(List<Doctor> listOfDoctor) {
		System.out.println("Enter the doctor Speciality");
		String speci = u.inputString();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getSpeci().equals(speci)) {
				doclist.add(listOfDoctor.get(i));
			}
		}
		return doclist;
	}
	public Doctor findByDocId(List<Doctor> listOfDoctor,int did) {
		Doctor doc=null;
//		System.out.println("enter the doctor id");
//		int did = u.inputint();
		for(int i=0;i<listOfDoctor.size();i++) {
			if(listOfDoctor.get(i).getDid()==did) {
				doc = listOfDoctor.get(i);
			}
		}
		return doc;
	}
	
	public void findByPname(List<Patient> listOfPatient) {
		System.out.println("Enter the Patient name");
		String name = u.inputString();
		for(int i=0;i<listOfPatient.size();i++) {
			if(listOfPatient.get(i).getName().equals(name)) {
				patlist.add(listOfPatient.get(i));
			}
		}
		for(int i=0;i<patlist.size();i++) {
			Patient temp = patlist.get(i);
			System.out.println(temp.getAge()+"  id "+temp.getId()+"  name  "+temp.getName()+"  mobilenumber "+temp.getPmbno());
		}
	}
	public Patient  findByNumber(List<Patient> listOfPatient) {
		Patient p = null;
		System.out.println("Enter the Patient number");
		String num = u.inputString();
		for(int i=0;i<listOfPatient.size();i++) {
			if(listOfPatient.get(i).getPmbno().equals(num)) {
				p = listOfPatient.get(i);
			}
		}
		return p;
	}
	public void  findByage(List<Patient> listOfPatient) {
		System.out.println("Enter the Patient age");
		int age = u.inputint();
		for(int i=0;i<listOfPatient.size();i++) {
			if(listOfPatient.get(i).getAge()==age) {
				patlist.add(listOfPatient.get(i));
			}
		}
		for(int i=0;i<patlist.size();i++) {
			Patient temp = patlist.get(i);
			System.out.println(temp.getAge()+"  id "+temp.getId()+"  name  "+temp.getName()+"  mobilenumber "+temp.getPmbno());
		}
		
	}
	public Patient findByPId(List<Patient> listOfPatient) {
		Patient id=null;
		System.out.println("enter the Patient id");
		int did = u.inputint();
		for(int i=0;i<listOfPatient.size();i++) {
			if(listOfPatient.get(i).getId()==did) {
				id = listOfPatient.get(i);
			}
		}
		return id;
	}
	

	
	
}
