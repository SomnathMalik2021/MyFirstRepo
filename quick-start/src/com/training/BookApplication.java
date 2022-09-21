package com.training;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj;
		
		Book headFirstJava = new Book();
		
		headFirstJava.setBookNumber(-101); 
		
		// If you print an object as part of sysout its toString method 
		// will be called
		
		System.out.println(headFirstJava);
		
	}

}
