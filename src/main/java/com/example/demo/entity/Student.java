package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String college="DRK";
	private String course;
	private int fee;
	private int cLangMarks;
	private int javaLangMarks;
	private int osMarks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String college, String course, int fee, int cLangMarks, int javaLangMarks,
			int osMarks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.college = college;
		this.course = course;
		this.fee = fee;
		this.cLangMarks = cLangMarks;
		this.javaLangMarks = javaLangMarks;
		this.osMarks = osMarks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getcLangMarks() {
		return cLangMarks;
	}
	public void setcLangMarks(int cLangMarks) {
		this.cLangMarks = cLangMarks;
	}
	public int getJavaLangMarks() {
		return javaLangMarks;
	}
	public void setJavaLangMarks(int javaLangMarks) {
		this.javaLangMarks = javaLangMarks;
	}
	public int getOsMarks() {
		return osMarks;
	}
	public void setOsMarks(int osMarks) {
		this.osMarks = osMarks;
	}
	
	
	
	
	
	
	

}
