package com.example.demo.utils;

public class Student {
	
	private int rollNo;
	private String studentName;
	private double score;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String studentName, double score) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.score = score;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", score=" + score + "]";
	}
	
	
}
