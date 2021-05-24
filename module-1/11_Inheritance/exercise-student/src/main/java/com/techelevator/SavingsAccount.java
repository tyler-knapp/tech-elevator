package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHoldersName, String accountNumber, int balance){
        super(accountHoldersName,accountNumber,balance);
    }

    public SavingsAccount(String accountHoldersName, String accountNumber){
        super(accountHoldersName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        if(super.getBalance() > 150) {
            super.withdraw(amountToWithdraw);
        }else if( super.getBalance() - amountToWithdraw < 150  && super.getBalance()  >= 0 ) {
                super.withdraw(amountToWithdraw + 2);
            } else {
                return super.getBalance();
            }
        return super.getBalance();
        }
    }
