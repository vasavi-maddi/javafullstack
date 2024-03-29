package com.revature.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entity.Allergy;
import com.revature.entity.dto.AllergyDto;
import com.revature.repository.AllergyRepository;
import com.revature.service.AllergyService;

@Service
public class AllergyServiceImpl implements AllergyService {

	@Autowired
	AllergyRepository allergyRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<AllergyDto> allAllergies() {
		List<Allergy> allergies = allergyRepository.findAll();
		return allergies.stream().map(allergy -> modelMapper.map(allergy, AllergyDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public AllergyDto getAllergyById(int id) {
		return modelMapper.map(allergyRepository.findById(id).get(), AllergyDto.class);
	}

}
