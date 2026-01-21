# Write your MySQL query statement below

SELECT EI.name as Employee FROM Employee as E
INNER JOIN Employee EI ON E.id = EI.managerId
WHERE EI.salary > E.salary;