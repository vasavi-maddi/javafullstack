package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="health_info")
public class HealthInfo {
	@Id //This Annotation from javax.persistence i.e. JPA
	@Column(name = "s_no") //This Annotation from javax.persistence i.e. JPA
	@GeneratedValue(strategy = GenerationType.IDENTITY) //This Annotation from javax.persistence i.e. JPA
	private Integer sNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patientId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointmentId")
	private Appointment appointmentId;
	
	@Column(name = "attendance", length = 100, nullable = false)
	private String attendance;
	
	@Column(name = "tests_done", length = 255)
	private String testsDone;

	public HealthInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInfo(Integer sNo, Patient patientId, Appointment appointmentId, String attendance, String testsDone) {
		super();
		this.sNo = sNo;
		this.patientId = patientId;
		this.appointmentId = appointmentId;
		this.attendance = attendance;
		this.testsDone = testsDone;
	}

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public Appointment getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Appointment appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getTestsDone() {
		return testsDone;
	}

	public void setTestsDone(String testsDone) {
		this.testsDone = testsDone;
	}

	@Override
	public String toString() {
		return "HealthInfo [sNo=" + sNo + ", patientId=" + patientId + ", appointmentId=" + appointmentId
				+ ", attendance=" + attendance + ", testsDone=" + testsDone + "]";
	}
	
	
}
