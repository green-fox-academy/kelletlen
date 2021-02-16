show databases;
create database if not exists todos;
show databases;
use todos;
drop table if exists todo;
create table if not exists todo
(
    id       integer primary key,
    task     text,
    isItDone boolean
);
insert INTO todo
VALUES (1, "Walk the dog", 0);
SELECT *
from todo;
insert INTO todo
VALUES (2, "Buy milk", 1);
insert INTO todo
VALUES (3, "Do homework", 0);
select *
from todo;
select id, task
from todo
where isItDone;
select id, task
from todo
where !isItDone;
update todo
set isItdone = true
where id = 1;
select *
from todo;
delete
from todo
where id = 2;
select *
from todo;



