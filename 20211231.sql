-- PRIMARY KEY
-- 각 테이블을 대표할 수 있는 대표데이터를 저장하는 컬럼에 붙이는 제약조건입니다.
-- 모든 테이블은 무조건 하나의 PRIMARY KEY를 갖는다.
-- PRIMARY KEY는 자동으로 중복을 방지하고 , NULL도 들어올 수 없다.
CREATE TABLE userTbl (
user_id VARCHAR(8) PRIMARY KEY,
user_name VARCHAR(10) NOT NULL,
birth_year INT(4) NOT NULL,
addr VARCHAR(4) NOT NULL,
phone_number VARCHAR(11),
height INT(3),
reg_date DATE
);

-- AUTO_INCREMENT (자동증가)
-- INT(정수)자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받는다.
-- 시작숫자는 1이다.
-- INSERT INTO 구문이 실행될 떄 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한번 쓰인 숫자는 다시 사용되지 않습니다.

-- FOREIGN KEY(외래 키)
-- 본 예시에서 쇼핑몰의 구매자는 반드시 회원이어야함.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건
-- "유저아이디는 유저테이블을 참조한다"
-- FOREIGN KEY는 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 함.
-- 참조컬럼에 있는 값만 (userTbl의 user_id에 존재하는 값) 참조하는 테이블의 대상에 올 수 있다.
-- **참조무결성의 성립**
CREATE TABLE buyTbl (
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id VARCHAR(8) NOT NULL,
prod_name VARCHAR(6) NOT NULL,
group_name VARCHAR(4),
price INT(7) NOT NULL,
amount INT(3) NOT NUll,
FOREIGN KEY(user_id) REFERENCES userTbl(user_id)
);

INSERT INTO userTbl VALUES('CYW', '최영우', '1991','부산', '01011111111', 178, '2021-12-28');
INSERT INTO userTbl VALUES('CHH', '최멍게', '1992','부산', '01022222222', 168, '2021-12-29');

SELECT * FROM userTbl;

INSERT INTO buyTbl VALUES(null, 'CYW', '기계식키보드', '주변기기', 200000, 1);
INSERT INTO buyTbl VALUES(null, 'SHM', '듀얼모니터', '주변기기', 400000, 1);
INSERT INTO buyTbl VALUES(null, 'EM', '도지코인', '가상화페', 1000000, 10);
select*from buyTbl;

INSERT INTO userTbl VALUES('SHM', '손흥민', '1991','춘천', '01033333333', 188, '2021-12-30');
INSERT INTO userTbl VALUES('EM', '일론머스크', '1971', '남아공', '010555555', 180, '2021-12-31');

select*from userTbl WHERE user_name ='최영우';

select*from buyTbl;

-- 비교연산
SELECT * FROM userTbl WHERE height >= 180;
SELECT * FROM userTbl WHERE birth_year >= 1991 AND birth_year <= 1999;
SELECT * FROM userTbl WHERE (birth_year >= 1991) AND (birth_year <= 1999);

-- BETWEEN AND 구문을 이용하면 범위조회가 쉽다.
SELECT * FROM userTbl WHERE birth_year BETWEEN 19991 AND 1999;

-- addr같은 문자열 자료는 숫자연산 처리가 불가능하다.
-- 지역이 서울이거나 혹은 화성인 사람 정보를 조회해보기
SELECT * FROM userTbl WHERE addr = '남아공' OR addr = '부산';

-- in키워드를 사용하면 컬럼명 in (데이터 1,2,3,4...);
-- 특정 컬럼 속 괄호에 담긴 데이터가 포함되는 경우를 전부 출력한다.
SELECT * FROM userTbl WHERE addr IN ('부산','춘천','남아공');






