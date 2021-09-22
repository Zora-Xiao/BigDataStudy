-- 1.查询在 SC 表存在成绩的学生信息
select * from student ,(select DISTINCT SId from sc) as score where student.SId=score.SId ; 


-- 2.查询「李」姓老师的数量
select COUNT(*) from teacher where Tname like '李%';

-- 3.查询学过「张三」老师授课的同学的信息  多表联合查询
select * from sc join student on sc.SId=student.SId AND  sc.CId=  (select CId from teacher  join  course  on teacher.TId=course.TId and teacher.Tname='张三' ) ;

-- 4.查询男生、女生人数 
select Ssex,COUNT(*) from student GROUP BY student.Ssex;

-- 5.查询 1990 年出生的学生名单 
select * from student where Sage like '1990%';

-- 6.查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列 
select CId,AVG(score) as ascore from sc GROUP BY CId ORDER BY ascore desc,CId asc; 


-- 7.查询课程编号为 01 且课程成绩在 80 分及以上的学生的学号和姓名 
select * from student  RIGHT JOIN course  join sc on course.CId= sc.CId AND sc.Cid='01' and sc.score>= 80 on student.SId=sc.SId ;

-- 8.查询" 01 "课程比" 02 "课程成绩高的学生的信息及课程分数 
 select * from student  RIGHT JOIN 
 (select student01.SId,student01.CId,score01,score02 from
 (select SId,CId, score as score01  from sc where CId='01') as student01, 
 (SELECT SId,CId,score as score02 from sc where cid='02') as student02
 where student01.SId=student02.SId and student01.score01>student02.score02) as score
 on student.SId=score.SId;
 -- 9.创建数据库mysql中创建一个数据表employee , 有以下字段
 -- id INT PRIMARY KEY AUTO_INCREMENT,  NAME VARCHAR(10),  gender CHAR(1), -- 性别  salary DOUBLE, -- 工资  bonus DOUBLE, -- 奖金  join_date DATE -- 入职日期示
 -- create database if not exists employee
create table employee (id int primary key,name VARCHAR(10),gender CHAR(1),salary DOUBLE ,bonus DOUBLE,join_date datetime);

--  employee 员工表中添加一些数据
insert into employee values(1,'李四','男',4000,3000,'2021-08-01');
insert into employee values(2,'王五','男',4000,1234,'2021-02-01');
insert into employee values(3,'李六','女',7000,3000,'2021-03-01');
insert into employee values(4,'张三','男',5000,5423,'2021-04-01');
insert into employee values(5,'阿七','男',3000,3000,'2021-05-01');
insert into employee values(6,'小一','女',7000,3000,'2021-06-01');
insert into employee values(7,'小二','男',4000,2000,'2021-07-01');
insert into employee values(8,'阿三','女',2000,3000,'2021-09-01');
insert into employee values(9,'阿十','男',4000,4000,'2021-08-02');
insert into employee values(10,'阿九','女',5000,3000,'2021-08-03');
insert into employee values(11,'小八','男',4000,4323,'2021-08-04');



