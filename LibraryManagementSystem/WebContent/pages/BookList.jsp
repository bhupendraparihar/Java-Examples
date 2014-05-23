<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="row">
	<div class="input-group">
		<input type="text" class="form-control">
		<span class="input-group-btn">
		  <button class="btn btn-default" type="button">Search</button>
		</span>
	</div><!-- /input-group -->
</div>
<br>
<table class="table table-striped">
	<tr>
		<th>#</th><th>Name</th><th>Author</th>
	</tr>
	<s:iterator value="bookList">
	<tr>
		<td><s:property value="bookNumber"/></td>
		<td><s:property value="bookName"/></td>
		<td><s:property value="bookAuthor"/></td>
	</tr>
	</s:iterator>
</table>