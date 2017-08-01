package com.soma.logical.main.clinque;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class clinqueManagement {
	public static ArrayList<DoctorDetails> readFromJson() throws IOException, ParseException{
		File file=new File("src/resource/doctor.json");
		FileReader reader=null;
		ArrayList<DoctorDetails> alDoctor=new ArrayList<DoctorDetails>();
		try{
			reader=new FileReader(file);
			JSONParser parser=new JSONParser();
			JSONArray objJsonArr=(JSONArray)parser.parse(reader);
			for(Object json: objJsonArr){
				DoctorDetails objDoctor=new DoctorDetails();
				JSONObject objJson = (JSONObject) json;
				objDoctor.setDoctorName(objJson.get("doctorName").toString());
				objDoctor.setDoctorId(Integer.parseInt(objJson.get("doctorId").toString()));
				objDoctor.setAvailability(Integer.parseInt(objJson.get("availability").toString()));
				objDoctor.setSpecilazation(objJson.get("specialization").toString());
				alDoctor.add(objDoctor);
			}
		}catch(FileNotFoundException e){
			e.getMessage();
		}
		return alDoctor;
	}
	public static ArrayList<PatientDetails> readPatientDetails() throws IOException, ParseException{
		File file=new File("src/resource/patient.json");
		FileReader reader=null;
		ArrayList<PatientDetails> alPatient=new ArrayList<PatientDetails>();
		try{
			reader = new FileReader(file);
			JSONParser parser=new JSONParser();
			JSONArray objJsonArr=(JSONArray)parser.parse(reader);
			for(Object json: objJsonArr){
				PatientDetails objPatient=new PatientDetails();
				JSONObject objJson = (JSONObject) json;
				objPatient.setPatientId(Integer.parseInt(objJson.get("patientId").toString()));
				objPatient.setPatientName(objJson.get("patientName").toString());
				objPatient.setAge(Integer.parseInt(objJson.get("age").toString()));
				objPatient.setMobNo(objJson.get("mobNo").toString());
				alPatient.add(objPatient);
			}
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		return alPatient;
	}
	
	public static ArrayList<Appointment> doAppointments(ArrayList<PatientDetails> alPatient, ArrayList<DoctorDetails> alDoctor){
		ArrayList<Appointment> alAppointments = new ArrayList<>();
		int randomDoc;
		for(int i =0;i<alPatient.size();i++){
			randomDoc = (int) (Math.random()*5);
			if(checkDocAvailablity(alAppointments, alDoctor.get(randomDoc).getDoctorId())){
				Appointment objAppointment = new Appointment();
				objAppointment.setDoctorId(alDoctor.get(randomDoc).getDoctorId());
				objAppointment.setPatientId(alPatient.get(i).getPatientId());
//				objAppointment.setId(objAppointment.getId()+1);
				alAppointments.add(objAppointment);
			}else{
				i--;
			}
		}
		return alAppointments;
	}
	public static boolean checkDocAvailablity(ArrayList<Appointment> alAppointments, int docId) {
		int noOfAppointment = 0;
		for(int i=0;i<alAppointments.size();i++){
			if(docId == alAppointments.get(i).getDoctorId()){
				noOfAppointment++;
			}
		}
		return noOfAppointment != 5;
	}
	
	public static void main(String args[]) throws IOException, ParseException{
		ArrayList<DoctorDetails> alDoctor = readFromJson();
		ArrayList<PatientDetails> alPatient = readPatientDetails();
		ArrayList<Appointment> alAppointments = doAppointments(alPatient, alDoctor);
		JSONArray objJsonArr = new JSONArray();
		for(int i=0;i<alAppointments.size();i++){
			JSONObject objJson = new JSONObject();
			objJson.put("appointmentId", alAppointments.get(i).getId());
			for(int j=0;j<alDoctor.size();j++){
				if(alAppointments.get(i).getDoctorId() == alDoctor.get(j).getDoctorId()){
					objJson.put("doctorName", alDoctor.get(j).getDoctorName());
					break;
				}
			}
			for(int j=0;j<alPatient.size();j++){
				if(alAppointments.get(i).getPatientId() == alPatient.get(j).getPatientId()){
					objJson.put("patientName", alPatient.get(j).getPatientName());
					break;
				}
			}
			objJsonArr.add(objJson);
			
			FileWriter objFile=new FileWriter("src/resource/appointment-details.json");
			objFile.write(objJsonArr.toJSONString());
			objFile.flush();
		}
	}

}
