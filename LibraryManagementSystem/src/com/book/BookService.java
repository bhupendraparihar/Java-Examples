package com.book;

import java.util.ArrayList;

import com.dto.Book;

public class BookService {
	
	public ArrayList<Book> getBookListService(){
		ArrayList <Book>bookList = new ArrayList<Book>();
		BookDao bookDao = new BookDao();
		bookList = bookDao.getBookListDao();
		return bookList;
	}
	
	public void createBook(Book book) throws Exception{
		BookDao bookDao = new BookDao();
		bookDao.insertBook(book);
	}
}
