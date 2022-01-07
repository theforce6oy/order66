-- mysql에서 변수를 지정할떄는 SET@을 사용.
SET @myVar1 = 5;
SET @myVar2 = 3;
SET @myVar3 = 4.25;
SET @myVar4 = '가수의 이름 =>';
-- 생성된 변수 출력
SELECT @myVar1;
-- 생성 변수에 계산식을 적용할 수도 있다.
SELECT @myVar2 + @myVar3;
-- 출력데이터 여럿 나열하기 (각 컬럼에 싹 다 붙어 나온다.)
SELECT @myVar4, user_name FROM userTbl;

-- 일반 구문에서는 LIMIT에 변수를 입력하여 쓸 수 없다.
SELECT * FROM userTbl LIMIT 3;
-- SELECT * FORM userTbl LIMIT @myVar2; (X)

-- PREPARE 구문
-- PREPARE 구문은 가변적으로 들어갈 문장요소 자리를 
-- ?로 뚫어놓고, 그자리를 채우는 방식으로 만든다.
SET @myVar5 = 3;
-- PREPARE 구문이름 FROM '실제 쿼리문';
PREPARE myQuery FROM 'SELECT user_name, height FROM userTbl LIMIT ?';
-- 호출은 EXCUTE 구문이름 USING 전달변수;
-- 저장된 구문의 ?에 값을 전달하기 위해 USING 전달값을 쓴다.
EXECUTE myQuery USING @myVar5;

-- 데이터 형식과 형 변환.
-- 데이터 변환시는 CAST(), CONVERT() 등의 함수를 이용하여 처리한다.
-- 두 함수의 차이는 거의 없음.
SELECT avg(amount) FROM buyTbl;
-- CAST(실행문 as 바꿀자료형);
SELECT CAST(avg(amount) as SIGNED INTEGER) FROM buyTbl;
-- CONVERT(실행문, 바꿀자료형);
SELECT CONVERT(avg(amount), SIGNED INT) FROM buyTbl;

-- 현재시간 출력하기
SELECT now();

-- 암시적 형 변환
SELECT '100' + 200; -- 문자+숫자는 정수로 변환
SELECT '100' + '300'; -- 문자+문자는 정수로 변환
SELECT '가나다' + 100; -- 정수끼리만 연산

-- 문자를 문자그대로 붙여서 출력하고 싶다면 CONCAT()을 쓴다.
SELECT CONCAT('100','200');
SELECT CONCAT(100, '300');

-- 문자 첫머리에 숫자가 포함된 경우 -> 첫 글자를 숫자로 변환
-- 문자만 있는 경우 -> 0으로 변환
-- 논리식의 경우 0은 false, 1은 true
SELECT 3 > '2mega';
SELECT 1 > 'AMEGA';

-- 내장함수
-- 내부에 이미 선언되어있어서 바로 호출하여 쓸 수 있는 함수.
-- if(수식, 참일떄 리턴, 거짓일때 리턴)
-- 삼항 연산자와 비슷하게 판단한다.
SELECT IF(300>200, '참입니다.', '거짓입니다.');

-- ifnull(수식1, 수식2)
-- 수식1이 null이 아니면 수식1이 반환 수식1이 null이면 수식2로 반환.
SELECT IFNULL(null, '널널'), IFNULL(100, '널널');

-- nullif(수식1, 수식2)
-- 수식1과 수식2가 같으면 null, 다르면 수식1 반환
SELECT NULLIF(100,100), NULLIF(200,100);

-- CASE~WHEN~ELSE~END
-- SWITH ~ CASE 구문과 비슷하게 들어온 자료와 일치하는 구간이 있으면 출력.
-- 없으면 ELSE쪽 자료를 출력.
-- 단, SQL{}로 코드 시작, 끝나는 범위를 표현하지 않기때문에 구문이 끝나는 시점에 END를 써 주어야한다.
SELECT CASE 2
WHEN 1 THEN '일'
WHEN 5 THEN '오'
WHEN 10 THEN '십'
ELSE '모름'
END AS '결과';

-- 문자열 아스키코드 확인
SELECT ASCII('B'), CHAR(97);
-- 문자열 길이 확인
SELECT CHAR_LENGTH('가나다라마바사');
-- 문자 나열
SELECT CONCAT('rk', 'rasa', 'asd');
-- 구문 바로뒤에 문자열과 문자열 사이를 구분하는 구분자를 붙여줌
SELECT CONCAT_WS('--','rk', 'rasa', 'asd');
-- FORMAT(숫자, 소숫점자리) -> 소숫점자리 n까지 출력
SELECT FORMAT(1234.56789999,3);
-- 이진수 자리 출력
SELECT BIN(31), HEX(31), OCT(31);

-- INSERT(기준문자열, 위치, 길이, 삽입할 문자열);
-- 기준 문자열의 위치~길이 사이를 지워주고, 그 사이에 삽입할 문자열을 새로 넣어준다.
SELECT INSERT('abcdefghi', 3, 4, '@@@@@');

-- LEFT(문자열,길이), RIGHT(문자열, 길이)
-- 해당 문자열의 왼쪽, 오른쪽에서 문자열 길이만큼만 남긴다.
SELECT LEFT('abcdefghi', 3), RIGHT('abcdefghi', 4);


-- 소문자를 대문자로(UPPERCASE) UCASE(영문자열)
-- 대문자를 소문자로 (LOWERCASE) LCASE(영문자열)
SELECT LCASE('abcdEFGH'), UCASE('abcdEFGH');
SELECT UPPER('abcdEFGH'), LOWER('abcdEFGH');

-- LPAD(문자열, 길이, 채울문자열), RPAD(문자열, 길이, 채울문자열)
-- 문자열을 길이만큼 늘려놓고 빈칸에 채울 문자열을 채워준다.
SELECT LPAD('이것이',5,'#'), RPAD('저것이', 6, '-');

-- LTRIM(문자열), RTRIM(문자열)
-- 문자열의 왼쪽/오른쪽 부분의 공백을 모두 없애준다.
-- 가운데 부분의 공백은 사라지지않는다.
SELECT '        이것', '저것     ';
SELECT LTRIM('             이것이'), RTRIM('저것이          ');

-- TRIM(문자열), TRIM(방향 '자를문자' FROM '대상문자)
-- TRIM은 기본적으로 LTRIM + RTRIM 형식으로 양쪽의 모든 공백을 다 제거해준다.
-- 공백이 아닌 특정 문자를 삭제하도록 구문을 지정할수도있다.
SELECT TRIM('       시발      ');
-- 방향 : BOTH(양쪽다), LEADING(왼쪽), TRAILING(오른쪽)
SELECT TRIM(both 'ㅋ' FROM 'ㅋㅋㅋㅋㅋㅋㅋㅋㄹㅇㅋㅋㅋㅋㅋㅋ');

-- REPEAT(문자열, 횟수)
-- 문자열을 횟수만큼 반복한다.
SELECT REPEAT('ㅋ',10);

-- REPLACE(문자열, 원래문자열, 바꿀문자열)
-- 문자열에서 원래 문자열을 찾아 바꿀문자열로 교체한다.
SELECT replace('자바로 작성됨', '자바', 'mysql');

-- REVERSE(문자열)
-- 문자열을 인덱스 역순으로 재배치해준다.
SELECT REVERSE('MYSQL');

-- SPACE(길이)
-- 길이만큼 공백 삽입
SELECT concat('fuck', space(50), 'shit');

-- SUBSTRING(문자열, 시작위치, 길이)
-- 시작위치부터 길이만큼 문자를 반환한다.
SELECT substring('자바스프링마이에스엘' ,6 ,4);
-- SUBSTRING(문자열 FROM 시작위치 FOR 길이)
SELECT substring('자바스프링마이에스엘' from 6 for 4);
-- 길이를 생략하고 파라미터를 2개만 주면, 시작지점부터 끝까지 모든 문자를 반환한다.
SELECT substring('자바스프링마이에스엘' from 6);

-- SQL 프로그래밍과 프로시저
-- DELIMITER $$ -- 시작지점
-- CREATE PROCEDURE 선언할 프로시저이름()
-- BEGIN --실제 실행코드는 BEGIN 아래에 작성.
-- 실행코드....
-- END $$
-- DELIMITER;

-- IF~ELSE문 프로시저로 만들어보기
DELIMITER $$
CREATE procedure ifProc()
begin
declare var1 INT;
SET var1 = 1000;
IF var1 = 100 THEN 
SELECT '100이 맞음';
else
SELECT '100이 아님';
END IF;
END $$
DELIMITER ;

-- 선언해둔 프로시저는 CALL 프로시저명();으로 호출할수있다.
CALL ifProc();

-- 프로시저 지우기 
drop procedure ifProc;

-- 데이터 호출구문을 프로시저로 만들어보기
DELIMITER $$
CREATE procedure getUser()
begin # 프로시저 내부에서 이렇게 주석달기 가능 
SELECT * FROM userTbl;
END $$ # 중괄호가 없으므로 닫는부분을 END키워드로 대체
DELIMITER ;

call getUser();

use employees;

/* DELIMITER $$
create procedure checkFiveYear()
begin
declare hireDATE date; # 입사일 얻어오기
declare todayDATE date; # 오늘날짜 얻어오기
declare days int; # 오늘날짜 - 입사일로 경과일수 얻기

# 10001번 사원의 해고일자 불러오기
select hire_date into hireDATE  # 10001번 직원의 hire_date값을 hireDATE에 저장
FROM employees WHERE emp_no = 10001; 
set todayDATE = current_date(); # 오늘날짜 구해오기

set days = datediff(todayDATE, hireDATE); # todayDATE - hireDATE

# 경과일수를 구하는 조건문
if (days/365) >= 5 then # 입사경과를 365로 나눠서 5년 이상인지 체크
select concat('입사한지', days, '일이 경과했습니다.');
else
select concat('5년 미만이고,' days, '일째 근무중');
end if;

END $$
DELIMITER ; */

DELIMITER $$
CREATE PROCEDURE checkFiveYear()
	BEGIN
		DECLARE hireDATE DATE; # 입사일 얻어오기
        DECLARE todayDATE DATE; # 오늘 날짜 얻어오기
        DECLARE days INT; # 오늘날짜 - 입사일 해서 경과일수 얻어오기
        
        SELECT hire_date INTO hireDATE
			FROM employees WHERE emp_no = 10001;
		# hire_date INTO hireDATE는
        # 위 쿼리문의 결과로 나온 10001번 직원의 hire_date의 값을 hireDATE에 저장해줍니다.
        
        SET todayDATE = CURRENT_DATE(); # 오늘날짜를 구해오는 기본기능
        SET days = DATEDIFF(todayDATE, hireDATE); # todayDATE - hireDATE를 수행
        
        #경과일수를 구하는 조건문
        IF (days/365) >= 5 THEN # 입사경과일을 365로 나눠서 5년 이상인지 체크
			SELECT CONCAT('입사한지', days, '일이 경과했습니다.');
		ELSE
			SELECT CONCAT('5년미만이고, ', days, '일쨰 근무중.');
		END IF;
	END $$
DELIMITER ;

call checkFiveYear();

-- 10001이라는 값을 직접 내부에서 선언하지 않고 그때그때 프로시저를 호출할 떄마다
-- 값을 바꿔넣을수 있도록 파라미터 처리를 하겠습니다.
DELIMITER $$
CREATE PROCEDURE checkFiveYear2(
	emp_number INTEGER
) # checkFiveYear2는 호출시 emp_number를 입력해야함.
	BEGIN
		DECLARE hireDATE DATE; # 입사일 얻어오기
        DECLARE todayDATE DATE; # 오늘 날짜 얻어오기
        DECLARE days INT; # 오늘날짜 - 입사일 해서 경과일수 얻어오기
        
        SELECT hire_date INTO hireDATE
			FROM employees WHERE emp_no = emp_number; # 입력받은 emp_number를 활용해 번호를 처리
		# hire_date INTO hireDATE는
        # 위 쿼리문의 결과로 나온 10001번 직원의 hire_date의 값을 hireDATE에 저장해줍니다.
        
        SET todayDATE = CURRENT_DATE(); # 오늘날짜를 구해오는 기본기능
        SET days = DATEDIFF(todayDATE, hireDATE); # todayDATE - hireDATE를 수행
        
        #경과일수를 구하는 조건문
        IF (days/365) >= 5 THEN # 입사경과일을 365로 나눠서 5년 이상인지 체크
			SELECT CONCAT(emp_number, '은 입사한지', days, '일이 경과했습니다.');
		ELSE
			SELECT CONCAT('5년미만이고, ', days, '일쨰 근무중.');
		END IF;
	END $$
DELIMITER ;
-- 호출시 사원번호를 넣어줘야합니다.
CALL checkFiveYear2(20000);