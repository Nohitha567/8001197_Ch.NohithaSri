CREATE OR REPLACE PROCEDURE GenerateMonthlyStatement(
    p_account_id NUMBER
)
IS
    CURSOR trans_cursor IS
        SELECT TransactionID,
               TransactionDate,
               Amount,
               TransactionType
        FROM Transactions
        WHERE AccountID = p_account_id;

BEGIN

    DBMS_OUTPUT.PUT_LINE(
        'Monthly Statement for Account: '
        || p_account_id
    );

    FOR trans_rec IN trans_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Transaction ID: '
            || trans_rec.TransactionID
            || ' Date: '
            || trans_rec.TransactionDate
            || ' Amount: '
            || trans_rec.Amount
            || ' Type: '
            || trans_rec.TransactionType
        );

    END LOOP;

END;
/
BEGIN
    GenerateMonthlyStatement(1);
END;
/