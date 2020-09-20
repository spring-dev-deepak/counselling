package com.deepak.project01.service;

import java.util.List;
import java.util.Optional;

import com.deepak.project01.entity.Colleges;

public interface CollegesService {

	List<Colleges> listAllColleges();
	List<Colleges> listCollegesByName(String collegeName);
	List<Colleges> listCollegeByCity(String city);
	Optional<Colleges> getCollegeById(String id);
	void saveCollege(Colleges college);
	void deleteCollege(String id);
}
