public class SavingAccount extends Account {

    private double interestRate = 0.0;

    public SavingAccount(String accountId, String accountHolder, double balance) {
        super(accountId, accountHolder, balance);
    }

    public SavingAccount(String accountId, String accountHolder, double balance, double interestRate) {
        super(accountId, accountHolder, balance);
        this.interestRate = interestRate;

    }

    public void addInterest() {
        this.deposit(interestRate * this.getBalance());
    }
    public String toString() {
        return "Saving " + super.toString() + "Interest Rate: " + interestRate;
    }
}
