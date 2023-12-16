package com.cbfacademy.accounts;

public class Account {

    private int accountNumber;
    private double balance;
    private double amount;
   private  double requested;

    
    //constructor that accepts parameters representing the new account number and starting balance
    public Account(int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

    };

   // returns the current account balance
   public double getBalance(){


        return this.balance;

   };

   //returns the account number
   public int getAccountNumber(){

        return this.accountNumber;

   };

   //deposits funds to the account and returns the new balance
   public double deposit(double amount){

        this.balance += amount;
        return this.balance;

   };

   /*withdraws funds from the account and returns the requested amount or  
   0 if the account has an insufficient balance */
   public double withdraw(double requested){

     if (this.balance >= requested) {
        this.balance -= requested;
            return requested;
     } else {
        return 0;
        }

};
