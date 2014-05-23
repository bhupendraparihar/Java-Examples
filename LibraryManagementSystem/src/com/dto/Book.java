package com.dto;

public class Book{
	private String bookNumber;
	private String bookName;
	private String bookAuthor;
	private String edition;
	private String bookTags;
	
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getBookTags() {
		return bookTags;
	}
	public void setBookTags(String bookTags) {
		this.bookTags = bookTags;
	}
}
