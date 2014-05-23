package com.common;

public interface SQLQueries {
	public static String GETBOOKLIST = "SELECT * FROM MYDB.L_BOOK";
	public static String GETMEMBERLIST = "SELECT * FROM MYDB.L_MEMBER";
	public static String INSERTBOOK = "insert into L_book(book_name,authors,edition,tag_names) values ";
	public static String INSERTMEMBER = "insert into l_member(f_name,l_name,address,id_proof_no) values ";
	public static String UPDATEMEMBER = "update l_member set ";
	public static String DELETEMEMBER = "delete from l_member where id = '";
}
