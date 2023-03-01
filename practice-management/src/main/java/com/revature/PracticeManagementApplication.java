package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.model.PatientDetails;
import com.revature.service.PatientService;

@SpringBootApplication
public class PracticeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeManagementApplication.class, args);
		
	}

}
