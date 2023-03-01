package com.revature.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.PatientDetails;


public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {

	Optional<PatientDetails> findPatientByName(String name);
}
