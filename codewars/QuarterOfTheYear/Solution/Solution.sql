-- # write your SQL statement here: you are given a table 'quarterof' with column 'month', return a table with column 'month' and your result in a column named 'res'.

CREATE OR REPLACE VIEW quarter (month, res) AS
SELECT
  month
  , CASE
      WHEN month >= 1 AND month < 4  THEN 1
      WHEN month >= 4 AND month < 7  THEN 2
      WHEN month >= 7 AND month < 10 THEN 3
      WHEN month >= 10 AND month <= 12 THEN 4

      END
  from quarterof;

select * from quarter;