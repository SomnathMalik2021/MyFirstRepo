package com.training;

public class Application {

	public static void main(String[] args) {
		
		// Type variableName = new Constructor();
		Greeting grtObj = new Greeting();
		
		
	   String  response=      grtObj.getMessage();
	   
	   
		System.out.println(response);
		
		System.out.println(grtObj.getMessage());
		
             System.out.println(grtObj.getMessage(args[0]));
             
             grtObj.sumNumbers(34, 56);
             
             
	}
}
