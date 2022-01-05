-- 정렬 기능 (오름차순)
SELECT * FROM userTbl ORDER BY reg_date;
-- 내림차순
SELECT * FROM userTbl ORDER BY height DESC;
-- 2개 이상 정렬하기
SELECT * FROM userTbl ORDER BY height ASC, birth_year DESC;
SELECT * FROM userTbl ORDER BY addr DESC, user_name ASC;

-- 중복값을 하나로 출력하기
SELECT DISTINCT addr FROM usertbl;

use employees;

-- 출력 요소의 개수를 제한할떄는 limit구문을 사용한다.
-- 인덱스 0번 부터 n개를 출력해준다.
SELECT * FROM employees limit 10;

-- limit은 order by와 결합해 쓸 수 있다.
SELECT * FROM employees ORDER BY hire_date DESC limit 10;

-- 일정 데이터셋을 먼저 얻어놓고 그 내부적으로 정렬시킬떈 서브쿼리를 쓴다.
SELECT * FROM (SELECT * FROM employees limit 10);

-- limit 시작순번, 출력데이터 갯수.
SELECT * FROM employees limit 6, 15;

use ict_practice;

-- 각 인물 별로 구매한 개수 정렬하기
SELECT user_id, amount FROM buytbl ORDER BY user_id;

-- 각 인물 별로 구매한 개수의 총합을 구해보기
-- SELECT 컬럼, 집계함수(컬럼명2)... FROM 테이블명 GROUP BY 묶을 컬럼명;
-- sum() 내부에서 +,-,* 등의 연산을 할 수 있다.
SELECT user_id, sum(amount) FROM buyTbl GROUP BY user_id;

-- 각 유저별 총 구매액을 구해보기 (가격*갯수의 결과의 총합)
-- 집계함수 뒤에 as '변경내용'은 sum 열의 이름을 원하는 이름으로 바꿔준다.
SELECT user_id, sum(price*amount) as 'total' FROM buyTbl GROUP BY user_id;

INSERT INTO buyTbl VALUES (null, 'WWG', '키보드', '왁초리', 250000, 10);
INSERT INTO buyTbl VALUES (null, 'DPM', '피규어', '취미잡화', 900000, 2);

DELETE FROM buyTbl WHERE user_id='WWG';

-- 각 유저별 구매물품의 평균가격 구하기
-- 평균은 avg(대상 칼럼명)으로 처리한다.
SELECT user_id, sum((price*amount)/amount) as 'total' FROM buyTbl GROUP BY user_id;
-- =
SELECT user_id, avg(price) as '평균가' FROM buyTbl GROUP BY user_id;

-- 키가 제일 큰 회원의 이름과 키를 표시해보기
SELECT user_name as '이름', height as '키' FROM userTbl WHERE height = (SELECT max(height) FROM userTbl);
-- userTbl에서 키가 가장 작은 회원 찾기
SELECT min(height) FROM userTbl;
SELECT user_name as '이름', height as '키' FROM userTbl WHERE height = (SELECT min(height) FROM userTbl);
-- 전체 평균키 구하기
SELECT avg(height) FROM userTbl;

-- 기존 쿼리문에서의 조건절은 WHERE절을 이용하여 처리했지만,
-- GROUP BY를 통해 집계하는 경우는 WHERE절을 받을 수 없다.
-- 대신 조건절을 HAVING으로 대체하여 사용한다.
-- WHERE과 사용법은 완전히 동일하다.

-- 사용자 별 총 구매액
SELECT user_id, sum(price*amount) FROM buyTbl GROUP BY user_id;
-- 구매액이 250000을 넘는 사람만 조회해보기
SELECT user_id, sum(price*amount) FROM buyTbl GROUP BY user_id HAVING sum(price*amount) > 250000;
-- =
SELECT user_id, sum(price*amount) as fuck FROM buyTbl GROUP BY user_id HAVING fuck > 250000;

SELECT user_name, height FROM userTbl GROUP BY user_id HAVING height > (SELECT avg(height) FROM userTbl);

SELECT addr, avg(height) FROM userTbl GROUP BY addr HAVING avg(height) > (SELECT avg(height) FROM userTbl);

-- SQL 구문의 분류

-- DML : Data Manipulation Language
-- 데이터 조작언어인 SELECT INSERT UPDATE DELETE 구문을 의미함

-- DDL : Data Definition Language
-- 데이터 정의 언어로 CREATE DROP ALTER 등 데이터베이스, 테이블, 뷰, 인덱스등을 생성하고 삭제함.
-- DML과 달리 commit; 없이도 바로바로 서버에 반영된다.

-- DCL : Data Control Language
-- 데이터 제어 언어로 특정 계정에 대한 권한을 부여하거나 뺏을떄 사용한다.
-- GRANT REVOKE DENY 등이 있다.

CREATE TABLE testtbl(
id INT,
user_name VARCHAR(3),
age INT
);
-- 테이블명 뒤에 컬럼정보를 적지않으면 테이블을 만들당시의 컬럼 순서대로 데이터가 대입된다.
INSERT INTO testtbl VALUES(1,'홍길동',25);
-- 일부 데이터만 넣을때 컬럼명을 생략하면 안됨.
INSERT INTO testtbl(id, user_name) VALUES(2, '홍길동');
-- 칼럼명 지정을 안했지만 age에 null을 넣고싶을떄
INSERT INTO testtbl VALUES(3, '이호영', null);
-- 입력 컬럼의 순서를 바꿔서 지정하는 경우, 모든 컬럼에 값을 입력하는 상황이어도 컬럼명을 따로 기입해야 한다.
INSERT INTO testtbl(user_name, age, id) VALUES ('최영우', 10, 4);

SELECT * FROM testtbl ORDER BY id;






