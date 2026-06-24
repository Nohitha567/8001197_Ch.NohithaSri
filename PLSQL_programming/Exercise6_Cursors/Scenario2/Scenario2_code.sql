CREATE OR REPLACE PROCEDURE ApplyAnnualFee
IS

    CURSOR savings_cursor IS
        SELECT AccountID
        FROM Accounts
        WHERE AccountType = 'Savings';

BEGIN

    FOR acc_rec IN savings_cursor LOOP

        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = acc_rec.AccountID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Annual fee applied successfully.'
    );

END;
/
BEGIN
    ApplyAnnualFee;
END;
/