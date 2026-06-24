CREATE OR REPLACE PACKAGE CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customer_id NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    );

    FUNCTION GetBalance(
        p_customer_id NUMBER
    ) RETURN NUMBER;

END CustomerManagement;
/
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_customer_id NUMBER,
        p_name VARCHAR2,
        p_dob DATE,
        p_balance NUMBER
    )
    IS
    BEGIN

        INSERT INTO Customers(
            CustomerID,
            Name,
            DOB,
            Balance,
            LastModified
        )
        VALUES(
            p_customer_id,
            p_name,
            p_dob,
            p_balance,
            SYSDATE
        );

        COMMIT;

        DBMS_OUTPUT.PUT_LINE(
            'Customer added successfully.'
        );

    END AddCustomer;

    FUNCTION GetBalance(
        p_customer_id NUMBER
    )
    RETURN NUMBER
    IS
        v_balance NUMBER;
    BEGIN

        SELECT Balance
        INTO v_balance
        FROM Customers
        WHERE CustomerID = p_customer_id;

        RETURN v_balance;

    EXCEPTION

        WHEN NO_DATA_FOUND THEN
            RETURN 0;

    END GetBalance;

END CustomerManagement;
/
BEGIN

    CustomerManagement.AddCustomer(
        5,
        'David Wilson',
        TO_DATE(
            '1995-08-10',
            'YYYY-MM-DD'
        ),
        25000
    );

END;
/
SELECT *
FROM Customers
WHERE CustomerID = 5;
SELECT CustomerManagement.GetBalance(5)
AS Customer_Balance
FROM Dual;
SELECT CustomerManagement.GetBalance(100)
FROM Dual;