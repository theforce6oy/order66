/* 1.데이터베이스 생성명령
DB생성시 한글을 쓸 수 있도록 -> default chracter set utf8; */

create database ict_practice default character set utf8mb4;

/* schemas 클릭 후, 새로고침 한 다음 ict_practice 우클릭
-> set as default schema를 클릭 -> 현재 명령을 받을 DB로 설정된다.

DB 사용자 계정 생성하기 */
drop user 'ict';
flush privileges;
/* user -> ID, identified by -> PASSWORD */
create user 'ict' identified by 'ict';

/* 사용자에게 권한 부여
grant 주고싶은 기능1, 주고싶은 기능2......
만약 모든 권한을 넘길땐 ㅁall privaileges to 권한을 넘길 계정 */

grant all privileges on ict_practice to 'ict';

/* 테이블 생성 명령
primary key - 칼럼의 주요 키를 뜻하며, 중복데이터를 방지한다.
하나의 칼럼은 반드시 primary key 속성을 가져야한다.
not null > 데이터에 널값이 들어오는것을 방지함 */

CREATE TABLE users( /*varchar(몇글자인지)*/
id varchar(20) primary key,
pw varchar(20) not null,
name varchar(30) not null,
email varchar(80)
);

/* select * from users;

select id, pw from users; */

/* 데이터 적재하기
insert into 테이블명 (컬럼1, 컬럼2....) values(컬럼1값, 컬럼2값....);
만약 모든 컬럼을 다 입력대상으로 지정시 지정컬럼은 생략가능
insert into 테이블명 values(컬럼1값, 컬럼2값...); */

insert into users values('abc1234', '1234', '최영우', 'abc@abc.com');
select * from users;

