package com.demo.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reg {

	@Id
	private int id;
	
	private String candidate_name;
	
	private String email;
	
	private String qualification;
	
	private int yop;
	
	private String collegename;
		
	private long mobile;

	public Reg(int id, String candidate_name, String email, String qualification, int yop, String collegename,
			long mobile) {
		super();
		this.id = id;
		this.candidate_name = candidate_name;
		this.email = email;
		this.qualification = qualification;
		this.yop = yop;
		this.collegename = collegename;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}
