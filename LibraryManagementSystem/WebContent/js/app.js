/**
 * 
 */

$(document).ready(function(){
	$('#BooksMenu').on('click',function(){
		$.get("getBookList.action", function( data ) {
			$(".content").html( data );
		});
		$('.active').removeClass('active');
		$(this).addClass('active');
	});
	
	$('#CreateBook').on('click',function(){
		$.get("createBookDisplay.action", function( data ) {
			$(".content").html( data );
		});
		$('.active').removeClass('active');
		$(this).addClass('active');
	});
	
	$('#MemberMenu').on('click',function(){
		$.get("getMemberList.action", function( data ) {
			$(".content").html( data );
		});
		$('.active').removeClass('active');
		$(this).addClass('active');
	});

	$('#CreateMember').on('click',function(){
		$.get("createMemberDisplay.action", function( data ) {
			$(".content").html( data );
		});
		$('.active').removeClass('active');
		$(this).addClass('active');
	});
	
	$('.content').on('click','#insertBookBtn',insertBook);
	
	$('.content').on('click','#insertMemberBtn',insertMember);
	
	$('.content').on('dblclick','#memberListTable tbody tr',loadUpdateScreen);
	
	$('.content').on('click','#deleteMemberBtn',deleteMember);
	
});

function insertBook(){
	var bookName = $('#bookName').val(),
		bookAuthors = $('#bookAuthors').val(),
		bookEdition = $('#bookEdition').val(),
		bookTags = $('#bookTags').val();
	
	$.ajax({
		  type: "POST",
		  url: "createBook.action",
		  data: { "book.bookName":bookName,
			  		"book.bookAuthor": bookAuthors,
			  		"book.edition":bookEdition,
			  		"book.bookTags":bookTags}
	}).done(function( msg ) {
			alert( "Data Saved: " + msg );
		});
}

function insertMember(){
	var id = $('#memberId').val(),
		fName = $('#fName').val(),
		lName = $('#lName').val(),
		address = $('#address').val(),
		idProofNo = $('#idProofNo').val();

	$.ajax({
		  type: "POST",
		  url: "createMember.action",
		  data: { "member.id":id,
			  		"member.fName": fName,
			  		"member.lName": lName,
			  		"member.address": address,
			  		"member.idProofNo": idProofNo}
	}).done(function( data ) {
		$(".content").html( data );
		});
}

function loadUpdateScreen(){
	var id = $(':first-child',this).html(),
		fName = $(':nth-child(2)',this).html(),
		lName = $(':nth-child(3)',this).html(),
		address = $(':nth-child(4)',this).html(),
		idProofNo = $(':nth-child(5)',this).html();
	$.ajax({
		type:'POST',
		url: "createMemberDisplay.action",
		data: { "member.id" : id,
				"member.fName": fName,
				"member.lName": lName,
				"member.address": address,
				"member.idProofNo": idProofNo}
	}).done(function(data){
		$(".content").html( data );
	});
}

function deleteMember(){
	var id = $('#memberId').val();
	$.ajax({
		type:'POST',
		url: "deleteMember.action",
		data: { "member.id" : id}
	}).done(function(data){
		$(".content").html( data );
	});
}

