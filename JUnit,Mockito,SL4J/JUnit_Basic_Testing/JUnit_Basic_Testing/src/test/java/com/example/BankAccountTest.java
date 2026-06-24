import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {

        System.out.println("Setup executed");

        account = new BankAccount(1000);
    }

    @After
    public void tearDown() {

        System.out.println("Teardown executed");

        account = null;
    }

    @Test
    public void testDeposit() {

        // Arrange
        double depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(
                1500,
                account.getBalance(),
                0.01
        );
    }
}   