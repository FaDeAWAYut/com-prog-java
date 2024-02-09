import java.util.NoSuchElementException;

class InvalidTransactionException extends NoSuchElementException {
    public InvalidTransactionException() {
        super("Not enough balance in the source wallet.");
    }
    public InvalidTransactionException(String message) {
        super(message);
    }
}

class SimpleTransactionManager implements TransactionManager {
    private String[] wallets = new String[1000];
    private String[] transactions = new String[10000];
    private int walletCount;
    private int transactionCount = 0;

    public SimpleTransactionManager(String [] wallets) {
        for(int i = 0; i < wallets.length; i++) {
            this.wallets[i] = wallets[i];
        }
        this.walletCount = wallets.length;
    }

    public boolean transferFunds(String senderWalletId, String receiverWalletId, double amount) throws InvalidTransactionException {

        if (!isValidWallet(senderWalletId)) {
            throw new IllegalArgumentException("Sender wallet does not exist.");
        }

        if (getBalance(senderWalletId) < amount && !senderWalletId.equals("Wallet0")) {
            throw new InvalidTransactionException("Not enough balance in the source wallet.");
        }

        if (!isValidWallet(receiverWalletId)) {
            wallets[walletCount] = receiverWalletId;
            this.walletCount += 1;
        }

        transactions[transactionCount] = senderWalletId + "|" + receiverWalletId + "|" + amount;
        this.transactionCount += 1;

        return true;
        
    }

    public double getBalance(String walletId) {
        if (!isValidWallet(walletId)) {
            throw new IllegalArgumentException("Invalid wallet ID.");
        }
  
        double balance = 0.0;
        for (int i = 0; i < transactionCount; i++) {
            String[] parts = transactions[i].split("\\|");
            if (parts[0].equals(walletId)) {
                balance -= Double.parseDouble(parts[2]);
            }
            if (parts[1].equals(walletId)) {
                balance += Double.parseDouble(parts[2]);
            }
        }
  
        return balance;
    }

    public boolean isValidWallet(String walletId) {
        for (int i = 0; i < wallets.length; i++) {
            if (wallets[i] == walletId) {
                return true;
            }

        }
        return false;


    }
}