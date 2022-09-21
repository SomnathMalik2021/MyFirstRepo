package com.training;
/*
 * <modifier>* class <class_name> {
<attribute_declaration>*
<constructor_declaration>*
<method_declaration>*
}

 */
public class Book {

	/*
	 * Defining Attributes
	 */
	private int bookNumber;
	private String bookName;
	private String author;
	private double price;
	
	
	public int getBookNumber() {
		return bookNumber;
	}


	public void setBookNumber(int bookNumber) {
		if(bookNumber<=0) {
System.out.println("ERR-101  - Book Number Should be a positive Integer");
		} else {
			this.bookNumber = bookNumber;

		}
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ "]";
	}


//	public String toString() {
//		return this.bookNumber+","+this.bookName+","+this.author+","+this.price;
//	}
	
	
	
}
