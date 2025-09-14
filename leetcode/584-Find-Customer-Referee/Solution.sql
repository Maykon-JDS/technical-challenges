# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2 OR NULLIF(referee_id, "") IS NULL;