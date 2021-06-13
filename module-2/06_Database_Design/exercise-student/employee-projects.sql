--CREATE DATABASE employee_projects;

CREATE TABLE employee(
        employee_id serial primary key,
        first_name varchar(32) not null,
        last_name varchar(32) not null,
);