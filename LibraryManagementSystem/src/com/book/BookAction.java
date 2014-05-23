package com.book;

import java.util.ArrayList;
import com.dto.Book;

public class BookAction {
	
	private ArrayList <Book>bookList;
	private Book book;

	public String getBookListAction(){
		BookService bookService = new BookService();
		setBookList(bookService.getBookListService()); 
		return "success";
	}
	
	public String createBook(){
		BookService bookService = new BookService();
		try{
			bookService.createBook(book);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}
	
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
