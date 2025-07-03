package Chapter8;

public class AccountRunner {
    public static void main(String[] args) {

        Account objCheque = new Account("234679","Tom", 25000, AccountType.CHEQUE);
        objCheque.deposit(1000);
        objCheque.withdraw(2500);//23500

        Account objSavings = new Account("123456","Tom", 2000, AccountType.SAVINGS);
        objSavings.deposit(500);
        objSavings.withdraw(600);//1900

        objCheque.transfer(objSavings, 500);

        System.out.println(objCheque.display("Cheque"));//22000
        System.out.println(objSavings.display("Savings"));//3400


    }
}
