# Write your MySQL query statement below

SELECT D.name AS "Department", E.name AS Employee, E.salary AS Salary FROM

(SELECT E.*, RANK() OVER(PARTITION BY departmentId  ORDER BY salary DESC) AS R FROM Employee E) AS E
LEFT JOIN Department D ON D.id = E.departmentId
WHERE E.R = 1;



-- LEFT JOIN Department D ON D.id = E.departmentId;