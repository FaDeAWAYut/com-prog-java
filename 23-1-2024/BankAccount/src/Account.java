public class Account {
    private String accountId;
    private String accountHolder;
    protected double balance;

    public Account(String  accountId, String accountHolder, double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String geAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if(amount > 0.0) {
            this.balance += amount;
        }
        else {
            System.out.println("[Error] Amount is negative ("+amount+")");
        }
    }


    public void withdraw(double amount) {
        if(amount > 0.0) {
            if(amount <= balance){
                this.balance -= amount;
            }
            else {
                System.out.println("[Error] Amount is greater than balance");
            }

        }
        else {
            System.out.println("[Error] Amount is negative ("+amount+")");
        }
    }

    public String toString() {
        return "Account: " + accountId + ", accountHolder: " + accountHolder + ", Balance: " + balance;
    }

}
