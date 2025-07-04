package Chapter9;

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

        if (this.getAccountType() == AccountType.SAVINGS){//false
            accountPrefix = "SV-";
        } else if (this.getAccountType() == AccountType.CREDIT) {//false
            accountPrefix = "CR-";
        } else if (this.getAccountType() == AccountType.DEBIT) {//false
            accountPrefix = "DB-";
        } else if (this.getAccountType() == AccountType.CHEQUE) {//false
            accountPrefix = "CQ-";
        } else {//true
            accountPrefix = "LN-";
        }
        this.accountNumber = accountPrefix + accountNumber;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance){
            throw new InsufficientFundsException("Insufficient Funds. " +
                    "\nAvailable Balance = " + this.getBalance() +
                    "\nRequested amount = " + amount);
        }
        this.balance = this.balance - amount;
    }

    public void transfer(Account targetAccount, double amountToTransfer) throws InsufficientFundsException {
        if (amountToTransfer > this.balance){
            throw new InsufficientFundsException("Insufficient Funds. " +
                    "\nAvailable Balance = " + this.getBalance() +
                    "\nRequested amount = " + amountToTransfer);
        }
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
