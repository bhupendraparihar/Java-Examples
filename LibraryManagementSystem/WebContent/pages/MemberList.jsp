<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="row">
	<div class="input-group">
		<input type="text" class="form-control">
		<span class="input-group-btn">
		  <button class="btn btn-default" type="button">Search</button>
		</span>
	</div>
</div>
<br>
<table id="memberListTable" class="table table-striped">
	<tr>
		<th>#</th><th>First Name</th><th>Last Name</th><th>Address</th><th>ID Proof No</th>
	</tr>
	<tbody>
	<s:iterator value="memberList">
	<tr>
		<td><s:property value="id"/></td>
		<td><s:property value="fName"/></td>
		<td><s:property value="lName"/></td>
		<td><s:property value="address"/></td>
		<td><s:property value="idProofNo"/></td>
	</tr>
	</s:iterator>
	</tbody>
</table>