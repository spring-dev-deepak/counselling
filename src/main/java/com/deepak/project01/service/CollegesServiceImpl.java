package com.deepak.project01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.project01.entity.Colleges;
import com.deepak.project01.repository.CollegesRepository;

@Service
public class CollegesServiceImpl implements CollegesService{
	
	private final CollegesRepository collegeRepository;

	@Autowired
	public CollegesServiceImpl(CollegesRepository collegeRepository) {
		this.collegeRepository = collegeRepository;
	}

	@Override
	public List<Colleges> listAllColleges() {
		return collegeRepository.findAll();
	}

	@Override
	public List<Colleges> listCollegesByName(String collegeName) {
		return collegeRepository.findByCollegeName(collegeName);
	}

	@Override
	public List<Colleges> listCollegeByCity(String city) {
		return collegeRepository.findByCity(city);
	}

	@Override
	public Optional<Colleges> getCollegeById(String id) {
		return collegeRepository.findById(id);
	}

	@Override
	public void saveCollege(Colleges college) {
		collegeRepository.save(college);
	}

	@Override
	public void deleteCollege(String id) {
		collegeRepository.deleteById(id);
	}
}
