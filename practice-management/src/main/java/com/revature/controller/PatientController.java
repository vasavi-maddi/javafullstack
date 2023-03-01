package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.PatientDetails;
import com.revature.service.PatientService;

@RestController
@RequestMapping(path="/api/v1") 
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	
	@PostMapping("/addPatient")
	public PatientDetails addPatient(@RequestBody PatientDetails patient) {
		return patientService.savePatient(patient);
	}
	
	@PostMapping("/addPatients")
	public List<PatientDetails> addPatients(@RequestBody List<PatientDetails> patients) {
		return patientService.savePatients(patients);
	}
	
	@GetMapping("/patients")
	public List<PatientDetails> findAllPatients(){
		return patientService.getPatients();
	}
	
	@GetMapping("/patients/{id}")
	public PatientDetails findPatientById(@PathVariable int id) {
		return patientService.getPatientById(id);
	}
	
	@GetMapping("/nurses/name/{name}")
	public PatientDetails findPatientByName(@PathVariable String name) {
		return patientService.getPatientByName(name);
	}
	
	@PutMapping("/update")
	public PatientDetails editPatient(@RequestBody PatientDetails patient) {
		return patientService.updatePatient(patient);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int id) {
		return patientService.deletePatient(id);
	}
}
