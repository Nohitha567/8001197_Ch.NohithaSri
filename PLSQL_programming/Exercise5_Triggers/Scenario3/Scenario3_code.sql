CREATE OR REPLACE TRIGGER trg_check_loan_amount
BEFORE INSERT
ON Loans
FOR EACH ROW
BEGIN

    IF :NEW.LoanAmount > 100000 THEN

        RAISE_APPLICATION_ERROR(
            -20010,
            'Loan amount exceeds maximum limit.'
        );

    END IF;

END;
/
INSERT INTO Loans
VALUES(
    10,
    1,
    50000,
    6,
    SYSDATE,
    ADD_MONTHS(SYSDATE,60)
);

COMMIT;
INSERT INTO Loans
VALUES(
    11,
    1,
    150000,
    6,
    SYSDATE,
    ADD_MONTHS(SYSDATE,60)
);