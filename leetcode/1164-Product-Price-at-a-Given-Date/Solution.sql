WITH cte AS
  (SELECT
   product_id,
   new_price,
   ROW_NUMBER() OVER(PARTITION BY product_id ORDER BY change_date DESC) AS line
   FROM Products
   WHERE change_date <= DATE("2019-08-16")
  )
SELECT Products.product_id,
    IF(ISNULL(cte.new_price), 10, cte.new_price) AS price
FROM Products
LEFT JOIN cte ON Products.product_id = cte.product_id AND cte.line = 1
GROUP BY Products.product_id
