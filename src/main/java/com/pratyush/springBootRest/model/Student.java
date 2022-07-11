package com.pratyush.springBootRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student")
public class Student {

	public long getStudentId() {
		return studentId;
	}
	public Student(String fname, String lname, String cohortId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.cohortId = cohortId;
	}
	public Student() {
		super();
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCohortId() {
		return cohortId;
	}
	public void setCohortId(String cohortId) {
		this.cohortId = cohortId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	
	@Column(name = "fname")
	private String fname;
	@Column
	private String lname;
	@Column
	private String cohortId;
}
