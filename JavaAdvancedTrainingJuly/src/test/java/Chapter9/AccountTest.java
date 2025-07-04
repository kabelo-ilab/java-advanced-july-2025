package Chapter9;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
        try{
            objAcc.withdraw(amountToWithdraw);
            double actualBalance = objAcc.getBalance();//22000
            //Assert
            assertEquals(expectedBalance, actualBalance);
        }catch (InsufficientFundsException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    @DisplayName("Test withdrawal - Insufficient funds")
    void testWithdrawInsufficientFunds() {
        //Arrange
        double amountToWithdraw = 26000;
        //Assert
        assertThrows(InsufficientFundsException.class,
                () -> objAcc.withdraw(amountToWithdraw));
    }

    @Test
    @DisplayName("Transfer: from current account to target account")
    void transfer() {
        //Arrange
        Account objTargetAccount = new Account("987456","Tom", 3000, AccountType.SAVINGS);
        double amountToTransfer = 2000;
        double expectedCurrentBalance = 23000;
        double expectedTargetBalance = 5000;
        try{
            //Act
            objAcc.transfer(objTargetAccount, amountToTransfer);
            double actualCurrentBalance = objAcc.getBalance();
            double actualTargetBalance = objTargetAccount.getBalance();
            //Assert

            assertAll(
                    () -> assertEquals(expectedCurrentBalance, actualCurrentBalance),
                    () -> assertEquals(expectedTargetBalance, actualTargetBalance)
            );
        }catch (InsufficientFundsException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    @DisplayName("Test transfer with insufficient funds")
    void testTransferInsufficientFunds(){
        //Arrange
        double amountToTransfer = 27000;
        Account objTargetAcc = new Account("987456","Tom", 3000, AccountType.DEBIT);
        //Assert
        assertThrows(InsufficientFundsException.class, () -> objAcc.transfer(objTargetAcc, amountToTransfer));
    }

    @ParameterizedTest(name = "Test Account number prefix : {arguments}")
    @CsvSource(value = {"234679,Tom,3000","005584,Jessica,25000", "123456,Peter,18500"})
    void testAccountNumber(String accNumber, String accHolder, double balance){
        //Assert
        assertAll(
                () -> assertEquals("SV-" + accNumber, new Account(accNumber,accHolder, balance, AccountType.SAVINGS).getAccountNumber()),
                () -> assertEquals("DB-" + accNumber, new Account(accNumber,accHolder, balance, AccountType.DEBIT).getAccountNumber()),
                () -> assertEquals("CQ-" + accNumber, new Account(accNumber,accHolder, balance, AccountType.CHEQUE).getAccountNumber()),
                () -> assertEquals("LN-" + accNumber, new Account(accNumber,accHolder, balance, AccountType.LOAN).getAccountNumber()),
                () -> assertEquals("CR-" + accNumber, new Account(accNumber,accHolder, balance, AccountType.CREDIT).getAccountNumber())
        );

    }
}