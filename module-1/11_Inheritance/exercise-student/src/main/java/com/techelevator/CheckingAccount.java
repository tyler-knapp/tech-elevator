package com.techelevator;

public class CheckingAccount extends BankAccount{
    final static int OVERDRAFTFEE = 10;

    public CheckingAccount(String accountHoldersName, String accountNumber, int balance){
        super(accountHoldersName, accountNumber, balance);
    }

    public CheckingAccount(String accountHoldersName, String accountNumber){
        super(accountHoldersName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
         if( super.getBalance() >=  amountToWithdraw ){
             super.withdraw(amountToWithdraw);
         } else if (super.getBalance() - amountToWithdraw >= -100){
                 super.withdraw(amountToWithdraw + 10);
             } else {
                 return super.getBalance();
             }
         return super.getBalance();
    }
}