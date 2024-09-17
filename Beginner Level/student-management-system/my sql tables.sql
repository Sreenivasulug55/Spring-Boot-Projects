USE student_management_system;
CREATE TABLE teacher(teacher_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,NAME VARCHAR(100),department VARCHAR(100));

CREATE TABLE courses(course_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,course_name VARCHAR(100),teacher_id INT NOT NULL,
FOREIGN KEY(teacher_id) REFERENCES teacher(teacher_id));
         
 CREATE TABLE class_room(class_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,class_name VARCHAR(100),teacher_id INT NOT NULL,
 FOREIGN KEY(teacher_id) REFERENCES teacher(teacher_id));
 
 CREATE TABLE student(student_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,student_name VARCHAR(100),classs_room_id INT NOT NULL,
 FOREIGN KEY(classs_room_id) REFERENCES class_room(class_id));
 
 CREATE TABLE student_course(student_course_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,student_id INT NOT NULL,course_id INT NOT NULL,
 FOREIGN KEY(student_id) REFERENCES student(student_id),
 FOREIGN KEY(course_id) REFERENCES courses(course_id));