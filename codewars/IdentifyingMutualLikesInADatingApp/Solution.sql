SELECT DISTINCT
    LEAST(a.liker_id, a.liked_id) AS user1_id,
    GREATEST(a.liker_id, a.liked_id) AS user2_id
FROM user_likes a
JOIN user_likes b
  ON a.liker_id = b.liked_id
 AND a.liked_id = b.liker_id
GROUP BY user1_id, user2_id
ORDER BY user1_id, user2_id;
