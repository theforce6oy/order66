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

-- like 연산자는 일종의 표현 양식을 만들어준다.
-- like 연산자를 이용하면  %라고 불리는 와일드카드나 혹은 _라고 불리는 와일드 카드 문자를 이용해서 
-- 매칭되는 문자나 문자열을 찾는다.
-- % 몇 글자가 오더라도 상관없다.
SELECT * FROM userTbl WHERE user_name LIKE '최%';

SELECT * FROM userTbl WHERE phone_number LIKE '01%';

SELECT * FROM userTbl WHERE user_id LIKE '__W';

-- 서브쿼리(하위쿼리)는 1차적 결과를 얻어놓고, 거기서 다시 조회구문을 중첩하여 날리는 것을 의미한다.

-- 기존의 방법 
-- 1. 최영우의 키 확인
SELECT height FROM userTbl WHERE user_name = '최영우';
-- 2. 확인한 키보다 큰 사람만 조회해본다.
SELECT height,user_name FROM userTbl WHERE height > 178;

-- 서브쿼리 활용 방법
-- FROM절 다음에 ()를 이용해 SELECT구문을 한번 더 활용한다.
-- 괄호 속 구문 먼저 실행 후 결과값이 저장된 상태에서 바깥 구문을 실행한다.
SELECT height,user_name FROM userTbl WHERE height > (SELECT height FROM userTbl WHERE user_name = '최영우');

-- 서브쿼리를 활용해 '최멍게' 보다 먼저 태어난 사람들만 골라내기
SELECT user_name,birth_year FROM userTbl WHERE birth_year < (SELECT birth_year FROM userTbl WHERE user_name = '최멍게');
-- (SELECT birth_year FROM userTbl WHERE user_name = '최멍게') > (SELECT user_name,birth_year FROM userTbl WHERE birth_year); (X)
-- 반드시 FROM절 다음에 ()구문이 위치해야한다.

-- 최대값은 max()로 최소값은 min()으로 도출한다.
-- 현재 컬럼에서 가장 나이가 적은 사람의 생년 조회하기
SELECT max(birth_year) FROM userTbl;
SELECT min(birth_year) FROM userTbl;

-- user_id에 C가 포함된 사람들 중 키가 제일 작은 사람보다 키가 더 큰 사람을 구하기
SELECT height,birth_year,user_name FROM userTbl WHERE height > (SELECT min(height) FROM userTbl WHERE user_id LIKE '%C%');

-- 2021년 가입자중 가입일이 제일빠른 사람의 키보다 큰 사람 구하기
-- 1.
SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01';
-- 2.
SELECT height FROM userTbl WHERE reg_date = 
(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01');
-- 3.
SELECT * FROM userTbl WHERE height > 
(SELECT height FROM userTbl WHERE reg_date = 
(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01'));

INSERT INTO userTbl VALUES ('WWG', '우왁굳', 1983, '서울', '01000001111', 185, '2020-07-04');
INSERT INTO userTbl VALUES ('DPM', '도파민', 1994, '서울', '01000002222', 174, '2020-06-23');
INSERT INTO userTbl VALUES ('KJV', '김자바', 1983, '서울', '01112341234', 171, '2020-08-15');
INSERT INTO userTbl VALUES ('ADR', '압둘라', 1995, '경기', '01012341234', 183, '2021-04-01');
INSERT INTO userTbl VALUES ('YSO', '야스오', 2001, '부산', '01043214321', 165, '2021-10-08');
INSERT INTO userTbl VALUES ('ZYA', '장위안', 1985, '부산', '01055555555', 164, '2020-02-28');
INSERT INTO userTbl VALUES ('SPR', '스프링', 1987, '강원', '01066666666', 184, '2021-12-31');
INSERT INTO userTbl VALUES ('JSP', '쟈스피', 1989, '전라', '01077777777', 177, '2022-01-01');


-- ANY, ALL, SOME 구문은 서브쿼리와 조합하여 사용한다.

-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문 만들기
-- SELECT * FROM userTbl WHERE height < (SELECT height FROM userTbl WHERE addr = '서울');
-- ()구문 속 도출된 값이 하나 이상이므로 여러값을 비교할 수 없어 에러가 난다.
SELECT * FROM userTbl WHERE height < (SELECT min(height) FROM userTbl WHERE addr = '서울');

-- ANY(SOME) 구문을 사용하면 하나 이상의 데이터에 대해 OR로 처리된다.
-- 개별 값 모두에 OR처리가 적용되어 각 데이터가 모두 조건에 대입 가능해진다.
-- ANY는 OR로 연결된다는 특성떄문에 범위가 가장 넓은 조건 [하나]로 통일된다.
-- ANY와 SOME은 사실상 차이가 없는 구문으로 봐도 무방하다.
SELECT * FROM userTbl WHERE height < ANY(SELECT min(height) FROM userTbl WHERE addr = '서울');

-- ALL 구문을 사용하면 개별값이 모두 AND로 연결된다.
SELECT height FROM userTbl WHERE addr = '서울';
-- SELECT height FROM userTbl WHERE height = 174 AND height = 171 AND height = 185;
-- 171 이하 값들이 다 잡혀나옴.
SELECT * FROM userTbl WHERE height < ALL(SELECT height FROM userTbl WHERE addr = '서울');
-- height < 174 AND height < 171 AND height < 185;



