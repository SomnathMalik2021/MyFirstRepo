package com.training;
/*
 * All Classes in Java either directly are indirectly extend the java.lang.Object class
 * 
 * Java Compiler Adds a Default Constructor to All the Java Classes - If the 
 *  user doesn't provide a constructor
 *  
 *  use javap to decompile and view the default constructor
 */


public class Greeting {

	public String getMessage() {
		
		return "Welcome to Java Programming";
	}
	
	public String getMessage(String name) {
		return "Hello" + name;
	}
	
	public void sumNumbers(int a, int b) {
		
		System.out.println(a+b);
	}
}
