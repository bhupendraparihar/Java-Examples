<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<form class="form-horizontal" role="form">
  <div class="form-group">
    <label for="bookName" class="col-sm-2 control-label">Book Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="bookName" placeholder="Book Name">
    </div>
  </div>
  <div class="form-group">
    <label for="bookAuthors" class="col-sm-2 control-label">Authors</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="bookAuthors" placeholder="Authors">
    </div>
  </div>
  <div class="form-group">
    <label for="bookEdition" class="col-sm-2 control-label">Edition</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="bookEdition" placeholder="Edition">
    </div>
  </div>
  <div class="form-group">
    <label for="bookTags" class="col-sm-2 control-label">Tags</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="bookTags" placeholder="Tags">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="button" id="insertBookBtn" class="btn btn-default">Insert</button>
    </div>
  </div>
</form>