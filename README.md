### Mysql Table Query

```
CREATE DATABASE db1 DEFAULT CHARACTER SET UTF8;

create table user (
	userId VARCHAR(20),
	userPassword VARCHAR(20),
	userName VARCHAR(20),
	userGender VARCHAR(20),
	userEmail VARCHAR(50),
	PRIMARY KEY (userId)
) charset=utf8;

create table bbs (
	bbsId INT,
	bbsTitle VARCHAR(50),
	userId VARCHAR(20),
	bbsDate DATETIME,
	bbsContent VARCHAR(2048),
	bbsIsDeleted INT,
	PRIMARY KEY (bbsId)
)charset=utf8;

```

