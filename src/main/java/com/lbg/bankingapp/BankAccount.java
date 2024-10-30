package com.lbg.bankingapp;

public class BankAccount {
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    private String accountHolderName;
    private long balance;
    private long minimumBalance;

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
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
}
