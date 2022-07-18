package com.arab.sample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long id;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, int subject1, int subject2, int subject3, int subject4, int subject5) {
		super();
		this.id = id;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject4() {
		return subject4;
	}
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}
	public int getSubject5() {
		return subject5;
	}
	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}
	
}
