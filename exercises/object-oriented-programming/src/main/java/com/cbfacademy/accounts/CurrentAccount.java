package com.cbfacademy.accounts;

//Using the `Account` class as a base class, create CurrentAccount
public class CurrentAccount extends Account{

    double overdraftLimit;
/*constructor that accepts parameters representing the new account number, 
starting balance and overdraft limit*/
public CurrentAccount(int accountNumber, double balance, double overdraftLimit){

    super(accountNumber, balance);
    this.overdraftLimit = overdraftLimit;
}

//Overriding the parent method to get the account number
@Override
public int getAccountNumber(){

     return super.getAccountNumber();

 };

//overriding the parent method to get the current balance
@Override
public double getBalance(){

    return super.getBalance();

};

  
//returns the current overdraft limit
public double getOverdraftLimit(){

    return this.overdraftLimit;

};

//sets the overdraft limit
public void setOverdraftLimit(double newLimit){

this.overdraftLimit = newLimit;

};

}
