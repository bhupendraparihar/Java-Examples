package com.member;

import java.util.ArrayList;

import com.dto.Member;

public class MemberAction {
	
	private ArrayList <Member>memberList;
	private Member member;
	
	public String getMemberListAction(){
		MemberService memberService = new MemberService();
		setMemberList(memberService.getMemberList()); 

		return "success";
	}
	
	
	public String createMember(){
		MemberService memberService = new MemberService();
		try{
			memberService.upsertMember(member);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}
	
	public String updateMember(){
		return "success";
	}
	
	public String deleteMember(){
		MemberService memberService = new MemberService();
		try{
			memberService.deleteMember(member);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}

	public ArrayList<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(ArrayList<Member> memberList) {
		this.memberList = memberList;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
