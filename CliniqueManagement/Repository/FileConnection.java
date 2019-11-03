package com.bridgelabz.CliniqueManagement.Repository;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.CliniqueManagement.Models.Doctor;
import com.bridgelabz.CliniqueManagement.Models.Patient;
import com.bridgelabz.CliniqueManagement.Services.Appointment;

public class FileConnection {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}
	File docfile = new File("Doctor.json");
	File patfile = new File("Patient.json");
	File apfile = new File("Appointment.json");
	
	public List<Doctor> readFileDoc() throws  IOException {
		
			List<Doctor> list = mapper.readValue(docfile,new TypeReference<List<Doctor>>(){});
		
		return list;
		
	}
	
	@SuppressWarnings("deprecation")
	public void writeFiledoc(List<Doctor> list) throws IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(docfile,list);
		
	}
	
public List<Patient> readFilePat() throws  IOException {
		
		List<Patient> listpat = mapper.readValue(patfile,new TypeReference<List<Patient>>(){});
	
	return listpat;	
}
	@SuppressWarnings("deprecation")
	public void writeFilepat(List<Patient> list) throws IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(patfile,list);
		
	}
	public HashMap<Appointment,Integer> readApp() throws IOException{
		HashMap<Appointment,Integer> Maplist = mapper.readValue(apfile, new TypeReference<HashMap<Appointment,Integer>>(){});
		return Maplist;
	}
	
	@SuppressWarnings("deprecation")
	public void writeApp(Object listOfapp) throws  IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(apfile,listOfapp);
		System.out.println("File has updated");
	}
	
	
	
	
	
	
	
}
