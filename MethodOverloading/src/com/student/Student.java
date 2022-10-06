package com.student;

public class Student {
	private int rollNo;
	private String  name;
	private int age;
	private double marks;
	private String course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int age, double marks, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.course = course;
	}
	
	public Student(int rollNo, String name, int age, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.course = "B.TECH";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
