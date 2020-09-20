package com.deepak.project01.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "colleges")
public class Colleges {

	@Id
	private String id;
	private String collegeName;
	private String collegeId;
	private String city;
	private List<CollegeDept> departments;
	private boolean govt;
	private boolean atonomous;
	
	public Colleges() {
		
	}

	public Colleges(String id, String collegeName, String collegeId, String city, List<CollegeDept> departments,
			boolean govt, boolean atonomous) {
		this.id = id;
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.city = city;
		this.departments = departments;
		this.govt = govt;
		this.atonomous = atonomous;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<CollegeDept> getDepartments() {
		return departments;
	}

	public void setDepartments(List<CollegeDept> departments) {
		this.departments = departments;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public boolean isGovt() {
		return govt;
	}

	public void setGovt(boolean govt) {
		this.govt = govt;
	}

	public boolean isAtonomous() {
		return atonomous;
	}

	public void setAtonomous(boolean atonomous) {
		this.atonomous = atonomous;
	}
}
