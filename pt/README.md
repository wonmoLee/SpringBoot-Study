create user 'spring'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'spring'@'%';
create database spring;
use spring;

drop table user;
drop table comment;
drop table post;

CREATE TABLE account(
	id int auto_increment primary key,
    username varchar(100) unique not null,
	accountNumber varchar(100) not null,
    money int
) engine=InnoDB default charset=utf8;

CREATE TABLE user(
	id int auto_increment primary key,
    username varchar(100) unique not null,
    password varchar(100) not null,
    email varchar(100),
    profile varchar(200),
    role varchar(40),
    createDate timestamp
) engine=InnoDB default charset=utf8;

CREATE TABLE post(
	id int auto_increment primary key,
    title varchar(100) not null,
    content longtext,
    userId int,
    createDate timestamp,
    foreign key (userId) references user (id) on delete set null
) engine=InnoDB default charset=utf8;

CREATE TABLE comment(
	id int auto_increment primary key,
    userId int,
    postId int,
    content varchar(300) not null,
    createDate timestamp,
    foreign key (userId) references user (id) on delete set null,
    foreign key (postId) references post (id) on delete cascade
) engine=InnoDB default charset=utf8;


insert into account(username, accountNumber,money)
values('홍길동', '01011112222', 50000);

insert into account(username, accountNumber,money)
values('장보고', '01033332222', 100000);

commit;

select * from user;
select * from post;
SELECT P.ID, P.TITLE, P.CONTENT, U.USERNAME FROM POST P INNER JOIN USER U ON P.USERID = U.ID;

update user set role = 'ROLE_ADMIN' where username = 'root';

use spring;