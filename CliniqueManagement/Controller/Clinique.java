package com.bridgelabz.CliniqueManagement.Controller;

import java.io.IOException;
import java.util.List;
import com.bridgelabz.CliniqueManagement.Models.Doctor;
import com.bridgelabz.CliniqueManagement.Models.Patient;
import com.bridgelabz.CliniqueManagement.Repository.FileConnection;
import com.bridgelabz.CliniqueManagement.Services.Operations;
import com.bridgelabz.CliniqueManagement.Services.Search;
import com.bridgelabz.CliniqueManagement.Services.Utility;

public class Clinique {

	public static void main(String[] args) throws IOException {
		Operations op= new Operations();
		Search s = new Search();
		
		Utility u = new Utility();
		
		FileConnection fcon = new FileConnection();

	
		do {
			
			System.out.println("1 : add Doctor");
			System.out.println("2 : add Patient");
			System.out.println("3: delete Doctor");
			System.out.println("4 : delete Patient");
			System.out.println("5 : Take Appointment");
			System.out.println("6 : search Patient");
			System.out.println("7 :Search Doctor");
		
			
			int choice = u.inputint();
			
			
			switch(choice) {
			case 1:
				List<Doctor> listOfdoc = fcon.readFileDoc();
				op.addDoctor(listOfdoc);
				fcon.writeFiledoc(listOfdoc);
				
				break;
			case 2:
				List<Patient> patlist = fcon.readFilePat();
				op.addPatient(patlist);
				fcon.writeFilepat(patlist);
				break;
			case 3:
				List<Doctor> doclist = fcon.readFileDoc(); 
				op.deleteDoctor(doclist);
				fcon.writeFiledoc(doclist);
				break;
			case 4:
				List<Patient> listofpat =fcon.readFilePat();
				op.deletePatient(listofpat);
				fcon.writeFilepat(listofpat);
				break;
	
			case 5:
				
				System.out.println("Enter Doctor Id ");
				int did=u.inputint();
			
				List<Doctor> alist = fcon.readFileDoc();
				Doctor doc=s.findByDocId(alist,did);
				
			
				if(doc!=null) {
					System.out.println("Enter the availablity");
					String avail = u.inputString();
					if(doc.getShift().equals(avail)) {
						
						if(doc.getAppointments()<5) {
							
							doc.setAppointments(doc.getAppointments()+1);
							System.out.println("Appointed ");
							fcon.writeFiledoc(alist);
							
						}else {
							System.out.println("Get another shift or another doctor");
						}
						
					}
					else {
						System.out.println("Doctor is not available at this shift");
					}
				}
				break;
			
			case 6:
				List<Patient> list = fcon.readFilePat();
				System.out.println("1 Search Patient by name");
				System.out.println("2 Search Patient By age");
				System.out.println("3 :Search Patient by id");
				System.out.println("4 : search Patient By number");
				int ch = u.inputint();
				switch(ch) {
				case 1:
					s.findByPname(list);
					break;
				case 2:
					s.findByage(list);
					break;
				case 3:
					Patient p = s.findByPId(list);
					System.out.println("Age "+p.getAge()+" Name "+p.getName()+" mobile "+p.getPmbno());
					break;
				case 4:
					Patient pi = s.findByNumber(list);
					System.out.println("id "+pi.getId()+"Age "+pi.getAge()+" Name "+pi.getName()+" mobile "+pi.getPmbno());
					break;
				}
					
					
					break;
				}
				System.out.println("if you want to perform more Operation enter true");
				
					
				
		}while(u.inputBoolean());
		
		System.out.println("File has Updated");
	}

}
