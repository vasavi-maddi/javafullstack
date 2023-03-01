package com.revature.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id // This Annotation from javax.persistence i.e. JPA
	@Column(name = "appointment_id") // This Annotation from javax.persistence i.e. JPA
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This Annotation from javax.persistence i.e. JPA
	private Integer appointmentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patientId;
	
	@Column(name = "date_of_appointment")
	private String dateOfAppointment;

	@Column(name = "status", length = 10, nullable = false)
	private String status;

	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Appointment(Integer appointmentId, Patient patientId, String dateOfAppointment, String status) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.dateOfAppointment = dateOfAppointment;
		this.status = status;
	}


	public Integer getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}


	public Patient getPatientId() {
		return patientId;
	}


	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}


	public String getDateOfAppointment() {
		return dateOfAppointment;
	}


	public void setDateOfAppointment(String dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", dateOfAppointment="
				+ dateOfAppointment + ", status=" + status + "]";
	}


	
}
