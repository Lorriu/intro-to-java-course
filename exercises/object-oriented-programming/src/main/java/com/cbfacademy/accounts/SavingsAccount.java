package com.cbfacademy.accounts;

//Using the `Account` class as a base class, create `SavingsAccount` class

public class SavingsAccount extends Account {

   private double interestRate;

    //constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){

        super(accountNumber, balance);
        this.interestRate = interestRate;
       
    }

    //overriding the parent method to get the current balance
    @Override
    public double getBalance(){

        return super.getBalance();

   };

   //overriding the parent method to get the account number
   @Override
   public int getAccountNumber(){

        return super.getAccountNumber();

    };

    //applies interest to the account
    public void applyInterest(){

        double interest = super.getBalance() * this.interestRate / 100;
        super.deposit(interest);
    };

    //returns the current interest rate
    public double getInterestRate(){

        return this.interestRate;

    };

    //sets the interest rate
    public void setInterestRate(double setRate){

        this.interestRate = setRate;

    };
}
