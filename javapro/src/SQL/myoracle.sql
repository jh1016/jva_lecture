select * from teb;			-- 테이블 목록
select * from seq;			-- 시퀸스 목록
select * from customer;
delete from CUSTOMER;

purge recyclebin;

-- 예1.
-- primary key 제약조선 : not null + unique
-- :  반드시 중복되지 않는 값을 저장해야 한다.
create table customer( no number(4)  primary key, 	--A primary key:A는 필수 키
													--not null : null값을 허용안한다
		       name varchar2(20),

		       email varchar2(20),

		       tel varchar2(20)  );
		       
-- 예2
alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

create sequence customer_no_seq
	start with 1
	increment by 1;
	
	
--게시판	
select * from tab;
select * from seq;
select * from BOARD;

create table board(
	no number primary key,	--primary key : 필수키 속성
	writer varchar2(20) not null,	--not null : null 값을 허용하지 않음
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );	
	
create sequence board_seq
start with 1
increment by 1;
	