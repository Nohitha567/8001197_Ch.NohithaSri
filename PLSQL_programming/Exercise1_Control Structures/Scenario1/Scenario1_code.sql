DECLARE
    V_AGE NUMBER;
BEGIN
    FOR CUST IN (
        SELECT
            CUSTOMERID,
            DOB
        FROM
            CUSTOMERS
    ) LOOP
        V_AGE := FLOOR(MONTHS_BETWEEN(SYSDATE, CUST.DOB) / 12);
        IF V_AGE > 60 THEN
            UPDATE LOANS
            SET
                INTERESTRATE = INTERESTRATE - 1
            WHERE
                CUSTOMERID = CUST.CUSTOMERID;

        END IF;

    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Loan interest rates updated successfully.');
END;
/