--CREATE DATABASE employee_projects;

--DROP TABLE IF EXISTS employee_project;
--DROP TABLE IF EXISTS employee_department;
--DROP TABLE IF EXISTS project;
--DROP TABLE IF EXISTS department;
--DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
        employee_id serial primary key,
        job_title varchar(32) not null,
        first_name varchar(32) not null,
        last_name varchar(32) not null,
        gender varchar(32) not null,
        date_of_birth varchar(32) not null,
        date_of_hire varchar(32) not null,
        department varchar(32) not null
);

CREATE TABLE department(
        department_id serial primary key not null,
        name varchar(32) not null
        
        --constraint chk_name check( type IN ('Accounting', 'Finance', 'Design'))
);

CREATE TABLE employee_department(
        department_id int not null,
        employee_id int not null,
        
        CONSTRAINT fk_employee_department_department_id FOREIGN KEY (department_id) REFERENCES department(department_id),
        CONSTRAINT fk_employee_department_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
        CONSTRAINT pk_employee_department PRIMARY KEY (department_id, employee_id)
);

CREATE TABLE project(
        project_id serial primary key not null,
        name varchar(32) not null,
        start_date varchar(32)
        
        --constraint chk_name check (type IN('Flow Chart', 'Asset Allocation', 'Vision Boarding', 'Presentation'))
);

CREATE TABLE employee_project(
        employee_id int not null,
        project_id int not null,
        
        CONSTRAINT fk_employee_project_project_id FOREIGN KEY (project_id) REFERENCES project(project_id),
        CONSTRAINT fk_employee_project_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
        CONSTRAINT pk_employee_project PRIMARY KEY (project_id, employee_id)
);
INSERT INTO department(department_id, name)
VALUES (1,'Accounting');

INSERT INTO department(department_id, name)
VALUES (2, 'Finance');

INSERT INTO department(department_id, name)
VALUES (3, 'Design');

INSERT INTO project(project_id, name, start_date)
VALUES (1, 'Hudson Ave', '06/21/2020');

INSERT INTO project(project_id, name, start_date)
VALUES (2, 'Miller City', '08/09/2020');

INSERT INTO project(project_id, name, start_date)
VALUES (3, 'Flat Rock', '03/27/2020');

INSERT INTO project(project_id, name, start_date)
VALUES (4, 'Grove Port', '09/05/2020');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (1, 'John', 'Fulton', 'Male', 'Design', 'Head of Design', '07/22/1955', '3/1/2019');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (2, 'Brian', 'Lauvray', 'Male', 'Design', 'VP Design', '08/22/1985', '3/2/2019');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (3, 'Rachelle', 'Rauh', 'Female', 'Accounting', 'Head of Accounting', '02/12/1985', '3/1/2019');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (4, 'Vinny', 'Sanfilipo', 'Male', 'Finance', 'Head of Finance', '01/01/1990', '3/1/2021');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (5, 'Jimmy', 'Buffet', 'Male', 'Finance', 'VP of Finance', '07/22/1945', '3/18/2017');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (6, 'Erica', 'Jones', 'female', 'Accounting', 'VP of Accounting', '07/09/1988', '8/1/2018');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (7, 'Ehrlich', 'Bachman', 'Male', 'Finance', 'Intern', '12/22/1977', '8/08/2016');

INSERT INTO employee(employee_id, first_name, last_name, gender, department, job_title, date_of_birth, date_of_hire)
VALUES (8, 'Monica', 'Green', 'Male', 'Design', 'Design Intern', '05/22/1995', '3/1/2019');

INSERT INTO employee_department(employee_id, department_id)
VALUES (1, 3);

INSERT INTO employee_department(employee_id, department_id)
VALUES (2, 3);

INSERT INTO employee_department(employee_id, department_id)
VALUES (3, 1);

INSERT INTO employee_department(employee_id, department_id)
VALUES (4, 2);

INSERT INTO employee_department(employee_id, department_id)
VALUES (5, 2);

INSERT INTO employee_department(employee_id, department_id)
VALUES (6, 1);

INSERT INTO employee_department(employee_id, department_id)
VALUES (7, 2);

INSERT INTO employee_department(employee_id, department_id)
VALUES (8, 3);
--
INSERT INTO employee_project(employee_id, project_id)
VALUES (1, 1);

INSERT INTO employee_project(employee_id, project_id)
VALUES (2, 2);

INSERT INTO employee_project(employee_id, project_id)
VALUES (3, 3);

INSERT INTO employee_project(employee_id, project_id)
VALUES (4, 4);

INSERT INTO employee_project(employee_id, project_id)
VALUES (5, 4);

INSERT INTO employee_project(employee_id, project_id)
VALUES (6, 3);

INSERT INTO employee_project(employee_id, project_id)
VALUES (7, 2);

INSERT INTO employee_project(employee_id, project_id)
VALUES (8, 1);

--Should I be inserting this much? I figured there'd be a way for employee_project, and employee_department 
--to autofill or auto-populate the key values once I create them in the employee or department tables. 
