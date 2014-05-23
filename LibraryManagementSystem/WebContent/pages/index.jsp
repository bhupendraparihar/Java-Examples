<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link rel="stylesheet" href="css/app.css">
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
   <div class="navbar-header">
      <a href="http://localhost:8080/LibraryManagementSystem/">
      	<img alt="" height="50px" width="50px" src="images/library.png">
      </a>
   </div>
   <div>
      <ul class="nav navbar-nav">
         <li class="dropdown">
         	<a data-toggle="dropdown" class="dropdown-toggle" href="#">Books <b class="caret"></b></a>
         	<ul role="menu" class="dropdown-menu">
         		<li id="BooksMenu"><a href="#">Search</a></li>
         		<li id="CreateBook"><a href="#">Insert</a></li>
         	</ul>
         </li>
         <li class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">Members <b class="caret"></b></a>
          <ul role="menu" class="dropdown-menu">
            <li id="MemberMenu"><a href="#">Browse</a></li>
            <li id="CreateMember"><a href="#">Insert</a></li>
          </ul>
        </li>
	</ul>
	<form class="navbar-form navbar-right" role="search">
			<input type="text" class="form-control" placeholder="Search">
			<span class="">
			  <button class="btn btn-default" type="button">Search</button>
			</span>
	</form>
   </div>
</nav>
<div class="content"></div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/app.js"></script>
</body>
</html>