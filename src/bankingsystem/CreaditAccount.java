package bankingsystem;

class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(int accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public void charge(double amount) {
        if (amount <= creditLimit || amount <= getBalance()) {
            withdraw(amount);
        } else {
            System.out.println("Exceeded credit limit.");
        }
    }
}

