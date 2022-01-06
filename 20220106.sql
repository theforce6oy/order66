-- 권한 없애기
-- GRANT 대신 REVOKE를 사용.
-- REVOKE TO FROM...
-- REVOKE 권한...ON DB명.테이블이름 FROM 계정

-- JOIN
-- 테이블 2개를 합쳐주는 기능
-- 연관된 데이터를 여러 테이블에 나눠 담았을때
-- 그것을 다시 재조립해준다.
-- 조인 문법
-- SELECT 테이블1.컬럼1, 테이블1.컬럼2, 테이블2,컬럼1, 테이블2,컬럼2...
-- FROM 테이블1 조인구문 테이블2 ON 테이블1.공통컬럼 = 테이블2.공통컬럼;
-- ON = WHERE

use ict_practice;
SELECT * FROM buyTbl INNER JOIN userTbl ON buyTbl.user_id = userTbl.user_id;

SELECT userTbl.user_name, userTbl.addr, userTbl.phone_number, buyTbl.* 
FROM buyTbl LEFT JOIN userTbl On buyTbl.user_id = userTbl.user_id;

SELECT * FROM buyTbl b INNER JOIN userTbl u ON b.user_id = u.user_id;

SELECT u.user_name, u.addr, u.phone_number, b.order_number, b.user_id, b.prod_name, b.group_name, b.price, b.amount 
FROM buyTbl b LEFT JOIN userTbl u On b.user_id = u.user_id;

SELECT u.user_name, u.addr, u.phone_number, b.* 
FROM buyTbl b LEFT JOIN userTbl u On b.user_id = u.user_id 
WHERE price <= 200000 ORDER BY price DESC;

SELECT u.user_name, u.addr, u.phone_number, b.* 
FROM userTbl u LEFT OUTER JOIN buyTbl b On u.user_id = b.user_id;

CREATE TABLE student(
user_name VARCHAR(3) PRIMARY KEY,
user_addr CHAR(2) NOT NULL
);

CREATE TABLE mambership(
user_name VARCHAR(3) PRIMARY KEY,
user_point INT NOT NULL
);
insert into student values ('강건마','서울'),('노영웅','수원'),('이상용', '인천');
insert into mambership values ('강건마',15000),('노영웅',37000),('김철수',5000);
select*from mambership;

SELECT * FROM student s LEFT OUTER JOIN mambership m ON s.user_name = m.user_name
UNION
SELECT * FROM student s RIGHT OUTER JOIN mambership m ON s.user_name = m.user_name;



