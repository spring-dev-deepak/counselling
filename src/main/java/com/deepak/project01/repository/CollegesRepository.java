package com.deepak.project01.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deepak.project01.entity.Colleges;

public interface CollegesRepository extends MongoRepository<Colleges, String>{

	List<Colleges> findByCollegeName(String collegeName);
	List<Colleges> findByCity(String city);
}
