package Chapter8;

enum AccountType{
    DEBIT, CHEQUE, CREDIT,
    SAVINGS, LOAN
}

/**
 * This class defines different attributes of a bank account
 */
public class Account {
    private AccountType accountType;
    private double balance;
    private String accountHolder;
    private String accountNumber;

    /**
     * Construct an object of Account
     * @param accountNumber Account number
     * @param accountHolder Account holder's name
     * @param balance Account balance
     * @param accType Type of Bank Account
     */
    public Account(String accountNumber,String accountHolder, double balance, AccountType accType) {
        setAccountType(accType);
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    /**
     * This method returns the Account Type
     * @return Account Type
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the current account type to a new account type
     * @param accountType A new account type
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Get the current account balance
     * @return Account balance
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the account number with a prefix based on the Account Type.
     * The prefix is set as follows: (SAVINGS = SV, LOAN = LN, DEBIT = DB, CHEQUE = CQ, CREDIT = CR)
     * @param accountNumber Account number
     */
    private void setAccountNumber(String accountNumber) {
        //savings = sv, debit = db, credit = cr, loan = ln, cheque = cq
        String accountPrefix = "NN";

        if (this.getAccountType() == AccountType.SAVINGS){
            accountPrefix = "SV-";
        } else if (this.getAccountType() == AccountType.CREDIT) {
            accountPrefix = "CR-";
        } else if (this.getAccountType() == AccountType.DEBIT) {
            accountPrefix = "DB-";
        } else if (this.getAccountType() == AccountType.CHEQUE) {
            accountPrefix = "CQ-";
        } else if (this.getAccountType() == AccountType.LOAN) {
            accountPrefix = "LN-";
        }
        this.accountNumber = accountPrefix + accountNumber;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    public void transfer(Account targetAccount, double amountToTransfer){
        //this.balance = this.balance - amountToTransfer;
        this.withdraw(amountToTransfer);
        //targetAccount.balance = targetAccount.balance + amountToTransfer;
        targetAccount.deposit(amountToTransfer);
    }

    public String display(String heading){
        return "============ " + heading + " ============\n" +
                "Account Holder: " + getAccountHolder() + " [" + getAccountNumber() + "]\n" +
                "Balance: " + getBalance() + "\n" + "Account Type: " + getAccountType();
    }

}
