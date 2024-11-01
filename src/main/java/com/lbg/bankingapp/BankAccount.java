package com.lbg.bankingapp;

public class BankAccount {
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    protected String accountHolderName;
    protected long balance;
    protected long minimumBalance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(String accountHolderName, double balance, double minimumBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = Math.round(balance*100);
        this.minimumBalance = Math.round(minimumBalance*100);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return (double) balance/100;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean withdraw(double l) {
        long withdrawAmount= Math.round(l*100);

        if ((this.balance - withdrawAmount >= this.minimumBalance) && (withdrawAmount > 0)) {
            this.balance -= withdrawAmount;
            return true;
        }

        return false;
    }

    public boolean deposit(double l) {
        long depositAmount= Math.round(l*100);

        if (depositAmount > 0) {
            this.balance += depositAmount;
            return true;
        }

        return false;
    }
}
