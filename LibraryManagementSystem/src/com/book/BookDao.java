package com.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.common.BaseDao;
import com.common.SQLQueries;
import com.dto.Book;

public class BookDao implements SQLQueries {
	public static Connection connection = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;
	
	public ArrayList<Book> getBookListDao(){
		ArrayList<Book> bookList = new ArrayList<Book>();
	 
		try {
			connection = BaseDao.createConnection();
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(SQLQueries.GETBOOKLIST);
			
			while(resultSet.next()){
				Book book = new Book();
				book.setBookNumber(resultSet.getString("BOOK_ID"));
				book.setBookName(resultSet.getString("BOOK_NAME"));
				book.setBookAuthor(resultSet.getString("AUTHORS"));
				
				bookList.add(book);
			}
			
			connection.close();
	 
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return bookList;
		}
		
		return bookList;
	}
	
	public void insertBook(Book book) throws Exception{
		connection = BaseDao.createConnection();
		statement = connection.createStatement();
		String sql = SQLQueries.INSERTBOOK + " ( '"+book.getBookName()
				+"','"+book.getBookAuthor()+"','"+book.getEdition()
				+"','"+book.getBookTags()+"')";
		statement.executeUpdate(sql);
		connection.close();
	}
}
