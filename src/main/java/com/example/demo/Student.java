package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer rno;
	private String name;
	private String course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer rno, String name, String course) {
		super();
		this.rno = rno;
		this.name = name;
		this.course = course;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
