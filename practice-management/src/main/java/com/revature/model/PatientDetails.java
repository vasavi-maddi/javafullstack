package com.revature.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_details")
public class PatientDetails {
	@Id
	@GeneratedValue
	@Column(name = "patient_id")
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="patient_email")
	private String email;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="date_of_birth")
	private String DateOfBirth;

	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientDetails(int patientId, String patientName, String email, String gender, String mobileNumber,
			String dateOfBirth) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.email = email;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		DateOfBirth = dateOfBirth;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", patientName=" + patientName + ", email=" + email
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", DateOfBirth=" + DateOfBirth + "]";
	}
	
}
