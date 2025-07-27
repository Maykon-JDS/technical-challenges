# Write your MySQL query statement below
SELECT D.name AS Department, E.name AS Employee, E.salary AS Salary FROM Department AS D
INNER JOIN Employee AS E ON E.departmentId = D.id
WHERE E.salary >= (SELECT MIN(R.salary) FROM (
        SELECT DISTINCT CQ_E.salary AS salary FROM Employee AS CQ_E WHERE CQ_E.departmentId = D.id  ORDER BY CQ_E.salary DESC LIMIT 3
    ) AS R
);
