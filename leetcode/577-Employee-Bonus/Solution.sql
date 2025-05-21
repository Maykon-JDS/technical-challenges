# Write your MySQL query statement below
SELECT E.name, B.bonus FROM Employee AS E
LEFT JOIN Bonus AS B ON E.empId = B.empId
WHERE B.bonus < 1000 || B.bonus IS NULL;