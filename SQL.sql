/*CRUD SPRING FRAMEWORK PROJECT TRAINER*/

create database if not exists prj_spring_crud;

use prj_spring_crud;

create table trainer(
id int not null auto_increment,
firstname varchar(30) not null,
lastname varchar(30) not null,
course varchar(30) not null,
primary key (id)
);

insert into trainer values 
(1,'jim','tsiko','java'),
(2,'tasos','fotiriou','python'),
(3,'xristos','xristopoulos', 'python');

select * from trainer;


update trainer set firstname='dim', lastname='dim', course='asfdasf' where id=8;