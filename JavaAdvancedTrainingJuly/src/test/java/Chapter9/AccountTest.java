package Chapter9;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    static Account objAcc;

    @BeforeEach
    void resetValues(){
        objAcc = new Account("234679","Tom", 25000, AccountType.CHEQUE);
    }

    @AfterEach
    void getCurrentData(){
        System.out.println(objAcc.display(objAcc.getAccountType().name()));
    }

    @Test
    @DisplayName("Test Account Deposit")
    void testDeposit() {
        //Arrange
        double amountToDeposit = 5000;
        double expectedBalance = 30000;
        //Actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();//27000
        //Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Test withdrawal")
    void withdraw() {
        //Arrange
        double amountToWithdraw = 3000;
        double expectedBalance = 22000;
        //Act
        objAcc.withdraw(amountToWithdraw);
        double actualBalance = objAcc.getBalance();//22000
        //Assert
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Transfer: from current account to target account")
    void transfer() {
        //Arrange
        Account objTargetAccount = new Account("987456","Tom", 3000, AccountType.SAVINGS);
        double amountToTransfer = 2000;
        double expectedCurrentBalance = 23000;
        double expectedTargetBalance = 5000;
        //Act
        objAcc.transfer(objTargetAccount, amountToTransfer);
        double actualCurrentBalance = objAcc.getBalance();
        double actualTargetBalance = objTargetAccount.getBalance();
        //Assert

        assertAll(
                () -> assertEquals(expectedCurrentBalance, actualCurrentBalance),
                () -> assertEquals(expectedTargetBalance, actualTargetBalance)
        );

    }
}