package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }

    //work on transferTo Method
    public int transferTo(BankAccount destinationAccount, int transferAmount) {
        //if checking account take money out of checking, transfer to to savings account
            // if savings account take money out of savings, transfer money to checking account
        if( destinationAccount instanceof CheckingAccount){
            withdraw(transferAmount);
            destinationAccount.deposit(transferAmount);
           // return destinationAccount.getBalance();
        } else if (destinationAccount instanceof SavingsAccount){
            withdraw(transferAmount);
            destinationAccount.deposit(transferAmount);
        }
        return destinationAccount.getBalance();
    }

}
