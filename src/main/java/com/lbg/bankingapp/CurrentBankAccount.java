package com.lbg.bankingapp;

public class CurrentBankAccount extends BankAccount {

    public long getMaximumWithdrawAmount() {
        return maximumWithdrawAmount;
    }

    public void setMaximumWithdrawAmount(long maximumWithdrawAmount) {
        this.maximumWithdrawAmount = maximumWithdrawAmount;
    }

    private long maximumWithdrawAmount;

    public CurrentBankAccount(String accountHolderName) {
        super(accountHolderName);
        this.maximumWithdrawAmount = 25000;
    }

    public CurrentBankAccount(String accountHolderName, double balance, double minimumBalance, double maximumWithdrawAmount) {
        super(accountHolderName, balance, minimumBalance);
        this.maximumWithdrawAmount = Math.round(maximumWithdrawAmount*100);
    }

    public CurrentBankAccount(String accountHolderName, double balance, double minimumBalance) {
        super(accountHolderName, balance, minimumBalance);
        this.maximumWithdrawAmount = 25000;
    }

    @Override
    public boolean withdraw(double l) {
        long withdrawAmount= Math.round(l*100);

        if ((this.balance - withdrawAmount >= this.minimumBalance) && (withdrawAmount > 0) && (withdrawAmount <= maximumWithdrawAmount)) {
            this.balance -= withdrawAmount;
            return true;
        }

        return false;
    }


}
