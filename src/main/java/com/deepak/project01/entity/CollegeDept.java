package com.deepak.project01.entity;

public class CollegeDept {

	private String name;
	private int totalSeat;
	private int remainingSeat;
	
	public CollegeDept() {
		
	}

	public CollegeDept(String name, int totalSeat, int remainingSeat) {
		this.name = name;
		this.totalSeat = totalSeat;
		this.remainingSeat = remainingSeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public int getRemainingSeat() {
		return remainingSeat;
	}

	public void setRemainingSeat(int remainingSeat) {
		this.remainingSeat = remainingSeat;
	}
}
