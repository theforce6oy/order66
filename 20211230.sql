create database library default character set utf8mb4;
/* use sys; ** use(데이터베이스) = Set as Defalut Schema */
grant all privileges on library to 'ict';

CREATE TABLE books (
book_name varchar(30) primary key,
book_price int(7) not null,
book_pub varchar(20) not null,
book_writer varchar(10) not null,
book_page int(5) not null 
);

insert into books values('스타워즈', '23000', '영우출판', '조지루카스', 275);
insert into books values('파운데이션', '45000', '영우출판', '아이작아시모프', 675);
insert into books values('듄', '24000', '영우출판', '프랜크허버트', 310);
insert into books values('스타쉽트루퍼스', '13000', '영우출판', '로버트하인라인', 238);
insert into books values('나는전설이다', '15000', '영우출판', '리차드매드슨', 146);
insert into books values('웨스트월드', '23000', '영우출판', '마이클크라이튼', 423);

select * from books;