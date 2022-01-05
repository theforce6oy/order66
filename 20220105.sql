use ict_practice;

SELECT * FROM testtbl;

CREATE TABLE testtbl2 (
id INT AUTO_INCREMENT PRIMARY KEY,
user_name VARCHAR(3),
age INT
);

INSERT INTO testtbl2 VALUES(null, '알파카', 4);
INSERT INTO testtbl2 VALUES(null, '에뮤', 2);
INSERT INTO testtbl2 VALUES(null, '토끼', 1);

-- 현재 3개의 데이터가 입력됬으므로 AUTO_INCREMENT의 다음 값은 4이다.
SELECT * FROM testtbl2;
DELETE FROM testtbl2 WHERE id;
-- ALTER 명령어로 깂을 수정해보기
ALTER TABLE testtbl2 AUTO_INCREMENT = 1000;

INSERT INTO testtbl2 VALUES(null, '반달곰', 10);
INSERT INTO testtbl2 VALUES(null, '산양', 3);
INSERT INTO testtbl2 VALUES(null, '물소', 12);
INSERT INTO testtbl2 VALUES(null, '호랑이', 5);
INSERT INTO testtbl2 VALUES(null, '사자', 3);

SELECT * FROM testtbl2;

CREATE TABLE testtbl3 (
id INT AUTO_INCREMENT PRIMARY KEY,
user_name VARCHAR(3),
age INT
);
-- testtbl3 초기 AUTO_INCREMENT값을 1500으로 고쳐보기
ALTER TABLE testtbl3 auto_increment = 1500;

-- 증가분을 1이아닌 3으로 세팅해보기
SET @@auto_increment_increment = 3;

INSERT INTO testtbl3 VALUES(null, '기린', 3);
INSERT INTO testtbl3 VALUES(null, '홍학', 1);
INSERT INTO testtbl3 VALUES(null, '치타', 4);
-- SET @@auto_increment_increment = 3; 의 경우 
-- 전체 테이블에 모두 적용되어 testtbl2도 3씩 증가하는 것을 알 수 있다.
INSERT INTO testtbl2 VALUES(null, '표범', 3);
INSERT INTO testtbl2 VALUES(null, '늑대', 3);
SELECT * FROM testtbl2;
SET @@auto_increment_increment = 1;

-- 하나의 구문에 여러 데이터로우 값을 추가할때는 VALUES 뒷쪽을 연달아 작성한다.
INSERT INTO testtbl2 VALUES (null, '말', 4),(null, '오리', 1),(null, '닭', 2);
SELECT * FROM testtbl2;
SELECT * FROM testtbl3;

-- UPDATE 구문은 기존에 입력되어있는 값을 변경할때 사용한다.
-- WHERE 조건절을 걸지 않는다면 컬럼 하나의 값을 전부 바꾼다.
-- 일반적으로는 무조건 조건절과 조합하여 사용.
-- UPDATE 테이블 SET 컬럼1=바꿀값1, 컬럼2=바꿀값2...
   UPDATE testtbl2 SET user_name = '소';
-- workbench에서 WHERE절없이 데이터를 수정하고 싶으면 안전업데이트 모드를 해제해야함.
-- 기본적으로는 여러 데이터값이 수정하려는 하나의 컬럼값으로 바뀌는것을 방지하기위해 안전모드로 막혀있다.
-- TERMINAL에서는 안전모드없이 위 구문이 실행됨.
SET SQL_SAFE_UPDATES= 0;
UPDATE testtbl2 SET user_name = '말';

-- WHERE절을 이용해 특정 나이대의 user_name을 바꾸기
UPDATE testtbl2 SET user_name = '고릴라' WHERE age = 4;
UPDATE testtbl2 SET user_name = '침팬치' WHERE age between 1 and 3;

-- UPDATE 구문이 전체 컬럼에 적용될 수 있다는것을 응용해 특정 컬럼의 값을
-- 계산식에 따라 일괄적으로 새로운 결과값으로 갱신하는것도 가능하다.
UPDATE testtbl2 SET age = age*2;
SELECT * FROM testtbl2;
UPDATE testtbl2 SET age = age/2;
SELECT * FROM testtbl2;

-- DELETE는 특정 컬럼만 삭제하는게 안된다.
-- 전체 행을 삭제하거나 삭제를 안해버리거나 이기 때문에 FROM 앞에 아무것도 적지않는다.
-- WHERE 없이 사용하면 해당 테이블의 전체 데이터를 삭제하기 때문에 특정 데이터만 삭제를 원하면 WHERE절을 붙여 사용한다.
-- id 1에 해당하는 데이터만 삭제해보기
DELETE FROM testtbl2 WHERE id = 1;
-- Limit을 사용하면 검색결과물 중 상위 n개만 삭제하는것도 가능하다.
DELETE FROM testtbl2 limit 2;
-- 데이터 전체 삭제
DELETE FROM testtbl2;

-- 대량의 데이터를 한번에 삭제할 경우 delete구문은 삭제시 한 행마다 트랜젝션로그를 작성하기 때문에
-- 속도가 느릴수 있다. 따라서 대량의 데이터를 삭제시에는 truncate를 대신 사용한다.
CREATE TABLE testtbl4(
id INT,
first_name VARCHAR(50),
last_name VARCHAR(50)
);
-- employees 테이블의 자료를 testtbl4로 복사해서 truncate 속도 비교해보기
INSERT INTO testtbl4 (SELECT emp_no, first_name, last_name FROM employees.employees);
SELECT * FROM testtbl4;
-- 소요시간 0.01초
-- TRUNCATE testtbl4;
-- 소요시간 2.1초
-- DELETE FROM testtbl4;
TRUNCATE testtbl4;

-- 조건부로 데이터 입력하기
-- 중복되는 데이터 값은 무시하고 나머지 값을 정상입력 시킬때 주로 쓴다.
CREATE TABLE mambertbl (
user_id VARCHAR(6) PRIMARY KEY,
user_name VARCHAR(3) NOT NULL,
addr VARCHAR(3) NOT NULL
);
-- PRIMARY KEY가 겹치면 무시하고 그렇지 않으면 입력해주는 코드로 변환
-- INSERT와 INTO 사이에 IGNORE 입력
INSERT IGNORE INTO mambertbl VALUES ('LSH', '이상혁', '서울');
INSERT IGNORE INTO mambertbl VALUES ('KHK', '김혁규', '서울');
INSERT IGNORE  INTO mambertbl VALUES ('JDH' '장도현', '서울');

INSERT INTO mambertbl VALUES ('LSH', '이상혁', '제주') on duplicate key update user_name = '이상혁', addr = '제주';
INSERT INTO mambertbl VALUES ('JDH', '정도현', '강원') on duplicate key update user_name = '정도현', addr = '강원';


-- DB 계정 관리하기

use mysql;
create user ict1@'%' identified by 'ictICT02';
create user ict2@'%' identified by 'ictICT03';
GRANT ALL ON *.* to ict2@'%' WITH GRANT OPTION;

-- icttest 계정에 ict_practice 데터베이스의 testtbl3테이블에 대한 셀렉트, 딜리트 권한만 부여하기
-- GRANT [권한명....] ㅒON 디비명.테이블명 TO 계정명@호스트명
grant select, delete on ict_practice.testtbl3 to icttest@'%';


delete from user where user = 'ict02';
flush privileges;

DROP user ict01@'%';
