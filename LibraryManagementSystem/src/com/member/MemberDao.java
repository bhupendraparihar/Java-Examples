package com.member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.common.BaseDao;
import com.common.SQLQueries;
import com.dto.Member;

public class MemberDao implements SQLQueries{
	public static Connection connection = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;
	
	public ArrayList<Member> getMemberListDao(){
		ArrayList<Member> memberList = new ArrayList<Member>();
	 
		try {
			connection = BaseDao.createConnection();
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(SQLQueries.GETMEMBERLIST);
			
			while(resultSet.next()){
				Member member = new Member();
				member.setId(resultSet.getString("ID"));
				member.setfName(resultSet.getString("F_NAME"));
				member.setlName(resultSet.getString("L_NAME"));
				member.setAddress(resultSet.getString("ADDRESS"));
				member.setIdProofNo(resultSet.getString("ID_PROOF_NO"));
				
				memberList.add(member);
			}
			connection.close();
	 
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		return memberList;
	}
	
	public void upsertMember(Member member) throws Exception{
		connection = BaseDao.createConnection();
		statement = connection.createStatement();
		String sql=null;
		if(member.getId().equals("")){
			sql = SQLQueries.INSERTMEMBER+ "('"+member.getfName()
					+ "','"+member.getlName() + "','"+member.getAddress() + "','"+member.getIdProofNo()+"')";
		}else{
			sql = SQLQueries.UPDATEMEMBER + " f_name='"+member.getfName()
			+ "',l_name='"+ member.getlName()
			+ "',address='"+member.getAddress()
			+ "',id_proof_no='"+member.getIdProofNo()
			+ "' where id = '" + member.getId() + "'";
			
			System.out.println(sql);
		}
		
		statement.executeUpdate(sql);
		connection.close();
	}
	
	public void deleteMember(Member member) throws Exception{
		connection = BaseDao.createConnection();
		statement = connection.createStatement();
		String sql = SQLQueries.DELETEMEMBER + member.getId() +"'";
		statement.executeUpdate(sql);
		connection.close();
	}
}