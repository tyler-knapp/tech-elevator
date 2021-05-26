package com.techelevator;

public class CreditCardAccount implements Accountable{

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountName, String accountNumber){
        this.accountHolder = accountName;
        this.accountNumber = accountNumber;
    }

    public int pay( int amountToPay){
        debt = debt - amountToPay;
        return debt;
    }

    public int charge(int amountToCharge){
        debt = debt + amountToCharge;
        return debt;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    @Override
    public int getBalance() {
        return debt * -1;
    }
}
