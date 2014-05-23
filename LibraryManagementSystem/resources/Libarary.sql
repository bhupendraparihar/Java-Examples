CREATE TABLE IF NOT EXISTS L_book (
  book_id int(10) NOT NULL AUTO_INCREMENT,
  book_name varchar(45) DEFAULT NULL,
  authors varchar(45) DEFAULT NULL,
  edition varchar(5) DEFAULT NULL,
  tag_names varchar(200) DEFAULT NULL,
  PRIMARY KEY (book_id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS L_MEMBER(
	ID INT(10) NOT NULL AUTO_INCREMENT,
	F_NAME VARCHAR(30) NOT NULL,
	L_NAME VARCHAR(30) DEFAULT NULL,
	ADDRESS VARCHAR(300) DEFAULT NULL,
	ID_PROOF_NO VARCHAR(50) NOT NULL,
	PRIMARY KEY (ID)
) ENGINE=InnoDB;

/*drop table l_book;*/

drop table l_member;

select * from MYDB.L_book;

select * from MYDB.L_MEMBER;

insert into l_member(f_name,l_name,address,id_proof_no)
values('Sheldon','Cooper','USA','111');


insert into l_member(f_name,l_name,address,id_proof_no)
values('Sheldon','Cooper','USA','111');

insert into L_book(book_name,authors,edition,tag_names)
values ('Head First Java','Kathy Sierra','1','Java,Programming');

insert into L_book(book_name,authors,edition,tag_names)
values ('JavaScript: The Definitive Guide','David Flanagan','1','Javascript,Programming');


insert into L_book(book_name,authors,edition,tag_names)
values ('Fundamental of Physics','David Halliday','1','Physics');

update l_member set  f_name=Mohit,l_name=Hofsteder,address=USA,id_proof_no=112 where id = '5'

commit;