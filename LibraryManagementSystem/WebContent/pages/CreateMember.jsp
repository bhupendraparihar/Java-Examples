<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<form  id="memberForm" class="form-horizontal" role="form">
	<input type="hidden" id="memberId" value="<s:property value="member.id"/>"/>
  <div class="form-group">
    <label for="fName" class="col-sm-4 control-label">First Name</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="fName" placeholder="First Name" 
      value="<s:property value="member.fName"/>">
    </div>
  </div>
  <div class="form-group">
    <label for="lName" class="col-sm-4 control-label">Last Name</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="lName" placeholder="Last Name"
      value="<s:property value="member.lName"/>">
    </div>
  </div>
  <div class="form-group">
    <label for="address" class="col-sm-4 control-label">Address</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="address" placeholder="Address"
      value="<s:property value="member.address"/>">
    </div>
  </div>
  <div class="form-group">
    <label for="idProofNo" class="col-sm-4 control-label">ID Proof No</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="idProofNo" placeholder="ID Proof No"
      value="<s:property value="member.idProofNo"/>">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-8">
      <button type="button" id="insertMemberBtn" class="btn btn-default">Insert</button>
       <button type="button" id="deleteMemberBtn" class="btn btn-default">Delete</button>
    </div>
  </div>
</form>