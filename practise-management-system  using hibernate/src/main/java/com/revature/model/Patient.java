package com.revature.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id //This Annotation from javax.persistence i.e. JPA
	@Column(name = "patient_id") //This Annotation from javax.persistence i.e. JPA
	@GeneratedValue(strategy = GenerationType.IDENTITY) //This Annotation from javax.persistence i.e. JPA
	private Integer patientId;
	
	@Column(name = "patient_name", length = 100, nullable = false)
	private String patientName;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "gender", length = 6, nullable = false)
	private String gender;
	
	@Column(name = "phone", length = 10, nullable = false)
	private String phone;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer patientId, String patientName, String email, String gender, String phone) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", email=" + email + ", gender="
				+ gender + ", phone=" + phone + "]";
	}
	
	
}
