SELECT DISTINCT L1.num AS ConsecutiveNums FROM Logs AS L1
JOIN Logs AS L2 ON L1.id + 1 = L2.id AND L1.num = L2.num
JOIN Logs AS L3 ON L1.id + 2 = L3.id AND L1.num = L3.num;