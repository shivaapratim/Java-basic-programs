package com.abc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student
{
	@Id
	@Column(name="roll")
	private int roll;
	
	@Column(name="name")
    private String name;
	
	@Column(name="marks")
    private int marks;
	
	
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	



	public int getRoll() {
		return roll;
	}






	public void setRoll(int roll) {
		this.roll = roll;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getMarks() {
		return marks;
	}






	public Student() {
		super();
	}






	public void setMarks(int marks) {
		this.marks = marks;
	}






	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}
