DROP TABLE IF EXISTS allPossibilities;
DROP TABLE IF EXISTS finalResults;

CREATE TEMP TABLE IF NOT EXISTS allPossibilities (
        res INT
);

CREATE TEMP TABLE IF NOT EXISTS finalResults (
        res INT
);

DO $$
DECLARE
    operators TEXT[] := ARRAY['*', '+'];
    operator1 TEXT;
    operator2 TEXT;
    record RECORD;
BEGIN

    FOR record IN
        SELECT a, b, c
        FROM expression_matter
    LOOP

        FOREACH operator1 IN ARRAY operators LOOP
          FOREACH operator2 IN ARRAY operators LOOP

            EXECUTE format('INSERT INTO allPossibilities VALUES ((%s %s %s) %s %s)', record.a, operator1, record.b, operator2, record.c);
            EXECUTE format('INSERT INTO allPossibilities VALUES (%s %s (%s %s %s))', record.a, operator1, record.b, operator2, record.c);

          END LOOP;
        END LOOP;

       INSERT INTO finalResults SELECT MAX(res) FROM allPossibilities;
       TRUNCATE allPossibilities;

    END LOOP;

END $$;

SELECT res FROM finalResults;
