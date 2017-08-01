package com.soma.logical.main.clinque;

import java.io.File;
import java.io.FileReader;

public class DoctorDetails {
	private String doctorName;
	private int doctorId;
	private String specilazation ;
	private int availability;
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpecilazation() {
		return specilazation;
	}
	public void setSpecilazation(String specilazation) {
		this.specilazation = specilazation;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}

}
