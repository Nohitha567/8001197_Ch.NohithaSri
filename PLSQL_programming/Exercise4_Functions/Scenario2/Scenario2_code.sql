CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_duration_months NUMBER
)
RETURN NUMBER
IS
    v_emi NUMBER;
BEGIN

    v_emi :=
        p_loan_amount /
        p_duration_months;

    RETURN ROUND(v_emi,2);

END;
/

SELECT
    LoanID,
    LoanAmount,
    CalculateMonthlyInstallment(
        LoanAmount,
        60
    ) AS Monthly_EMI
FROM Loans;