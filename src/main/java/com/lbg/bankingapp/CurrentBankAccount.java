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
        this.maximumWithdrawAmount = 25000;
        super(accountHolderName);
    }

    public CurrentBankAccount(String accountHolderName) {
        super(accountHolderName);
    }


}
