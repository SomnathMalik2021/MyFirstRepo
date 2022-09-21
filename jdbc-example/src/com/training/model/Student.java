package com.training.model;

public class Student implements Comparable<Student>{
	private int roll ; 
	private String name; 
	private int mark ; 
	
	public Student(String name, int roll, int mark){
		this.setName(name) ; 
		this.setMark(mark) ; 
		this.roll = roll ; 
	}
	
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return getName() + " " + roll + " " + getMark() ; 
	}

	@Override
	public int compareTo(Student obj) { // big to small 
		return -(this.getMark() - obj.getMark());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNumber() {
		return this.roll ; 
	}
	
	public void setRollNumber(int roll) {
		this.roll = roll ; 
	}
}
