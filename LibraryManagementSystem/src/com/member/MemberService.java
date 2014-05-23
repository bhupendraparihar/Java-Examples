package com.member;

import java.util.ArrayList;

import com.dto.Member;

public class MemberService {
	
	public ArrayList<Member> getMemberList(){
		ArrayList <Member>memberList = new ArrayList<Member>();
		MemberDao memberDao = new MemberDao();
		memberList = memberDao.getMemberListDao();
		return memberList;
	}
	
	public void upsertMember(Member member) throws Exception{
		MemberDao memberDao = new MemberDao();
		memberDao.upsertMember(member);
	}
	
	public void deleteMember(Member member) throws Exception{
		MemberDao memberDao = new MemberDao();
		memberDao.deleteMember(member);
	}
}
