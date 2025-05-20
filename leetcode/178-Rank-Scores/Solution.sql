# Write your MySQL query statement below
SELECT S.score, dense_rank() OVER(ORDER BY S.score DESC) AS 'rank'
FROM Scores AS S
ORDER BY S.score DESC;
