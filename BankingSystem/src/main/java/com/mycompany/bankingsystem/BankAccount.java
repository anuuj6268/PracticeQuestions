package com.mycompany.bankingsystem;

public class BankAccount {
private int accountNumber;
private double balance;

public BankAccount(int a,double b){
    accountNumber = a;
    balance = b;
}
public void setDeposit(double amountCredit){
    balance = balance + amountCredit;
}
public void setWithdraw(double amountDebit){
    balance = balance - amountDebit;
}
public int getAccountNumber(){
    return accountNumber;
}
public double getBalance(){
    return balance;
}
}
