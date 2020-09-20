package com.deepak.project01.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.project01.entity.Colleges;
import com.deepak.project01.service.CollegesServiceImpl;

@RestController
@RequestMapping("/api/v1/colleges")
public class CollegesRestController {

	private final CollegesServiceImpl service;

	@Autowired
	public CollegesRestController(CollegesServiceImpl service) {
		this.service = service;
	}
		
	@GetMapping
	public List<Colleges> listCollegeByName(
			@RequestParam(required = false) String collegeName,
			@RequestParam(required = false) String city){
		
		if(collegeName != null)
			return service.listCollegesByName(collegeName);
		else if(city != null)
			return service.listCollegeByCity(city);
		else
			return service.listAllColleges();
	}	
}

















