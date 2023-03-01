package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.PatientDetails;
import com.revature.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public PatientDetails savePatient(PatientDetails patient) {
		return patientRepository.save(patient);
	}
	
	public List<PatientDetails> savePatients(List<PatientDetails> patients) {
		return patientRepository.saveAll(patients);
	}
	
	public List<PatientDetails> getPatients(){
		return patientRepository.findAll();
	}
	
	public PatientDetails getPatientById(int id) {
		return patientRepository.findById(id).orElse(null);
	}
	
	public PatientDetails getPatientByName(String name) {
		return patientRepository.findPatientByName(name).orElse(null);
	}
	
	public String deletePatient(int id) {
		patientRepository.deleteById(id);
		return "Patient removed : " + id;
	}
	
	public PatientDetails updatePatient(PatientDetails patient) {
		PatientDetails existingPatient = patientRepository.findById(patient.getPatientId()).orElse(null);
		existingPatient.setPatientName(patient.getPatientName());
		existingPatient.setEmail(patient.getEmail());
		existingPatient.setGender(patient.getGender());
		existingPatient.setMobileNumber(patient.getMobileNumber());
		existingPatient.setDateOfBirth(patient.getDateOfBirth());
		return patientRepository.save(existingPatient);
	}

}
