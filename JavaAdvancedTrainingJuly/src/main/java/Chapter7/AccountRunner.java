package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
        Account objAccount = new Account("123456","Tom", 2000, AccountType.SAVINGS);
        System.out.println(objAccount.display());

        Account objAccount1 = new Account("234679","Tom", 25000, AccountType.CREDIT);
        System.out.println("==================================");
        System.out.println(objAccount1.display());

    }
}
