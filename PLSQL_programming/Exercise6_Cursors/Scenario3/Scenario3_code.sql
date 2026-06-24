CREATE OR REPLACE PROCEDURE UpdateLoanInterest
IS

    CURSOR loan_cursor IS
        SELECT LoanID,
               InterestRate
        FROM Loans;

BEGIN

    FOR loan_rec IN loan_cursor LOOP

        UPDATE Loans
        SET InterestRate =
            InterestRate + 0.5
        WHERE LoanID =
              loan_rec.LoanID;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Loan interest rates updated.'
    );

END;
/
BEGIN
    UpdateLoanInterest;
END;
/