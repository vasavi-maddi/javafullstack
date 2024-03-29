package com.revature.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entity.Patient;
import com.revature.entity.dto.PatientDto;
import com.revature.repository.PatientRepository;
import com.revature.service.PatientInfoService;

@Service
public class PatientInfoServiceImpl implements PatientInfoService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<PatientDto> getAllPatients() {
		List<Patient> patients=patientRepository.findAll();
		return patients.stream().map(patient -> modelMapper.map(patient, PatientDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public PatientDto getPatientById(int id) {
		return modelMapper.map(patientRepository.findById(id).get(), PatientDto.class);
	}

	@Override
	public PatientDto updatePatientById(int id,PatientDto patientDto) {
		Patient patient=patientRepository.findById(id).get();
		patient.setAddress(patientDto.getAddress());
		patient.setContactNumber(patientDto.getContactNumber());
		patient.setDob(patientDto.getDob());
		patient.setEmail(patientDto.getEmail());
		patient.setFirstName(patientDto.getFirstName());
		patient.setGender(patientDto.getGender());
		patient.setLastName(patientDto.getLastName());
		patient.setPassword(patientDto.getPassword());
		patient.setTitle(patientDto.getTitle());
		patientRepository.saveAndFlush(patient);
		return modelMapper.map(patient, PatientDto.class);
	}

}
