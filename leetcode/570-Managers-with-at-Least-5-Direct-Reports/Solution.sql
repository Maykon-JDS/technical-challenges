# Write your MySQL query statement below

WITH cte AS (
    SELECT managerID, COUNT(managerID) FROM Employee WHERE managerID IS NOT NULL GROUP BY managerID HAVING COUNT(managerID) >= 5
)
SELECT Employee.name FROM Employee
LEFT JOIN cte ON cte.managerID = Employee.id
WHERE cte.managerID = Employee.id;