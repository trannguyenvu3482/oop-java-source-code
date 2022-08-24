package bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    final double RATE = 0.035;

    Locale local = new Locale("vi", "vn");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);

    // Constructors
    public Account() {
        this.accountNumber = 999999;
        this.name = "Chua xac dinh";
        this.balance = 50000;
    }

    public Account(String name, long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(String name, long accountNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    // Getter and Setter
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 50000) {
            this.balance = balance;
        }
    }

    // Methods
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount > 0 && amount + fee <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void addInterest() {
        this.balance += this.balance * RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            acc2.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s", this.name, this.accountNumber, formatter.format(this.balance));
    }
}
