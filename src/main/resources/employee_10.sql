create database employee_10;

use employee_10;

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(100)
);


INSERT INTO employee (name, position) VALUES 
('name1', 'position1'),
('name2', 'position2'),
('name3', 'position3'),
('name4', 'position4'),
('name5', 'position5');

select * from employee;