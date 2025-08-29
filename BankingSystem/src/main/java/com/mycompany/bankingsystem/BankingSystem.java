package com.mycompany.bankingsystem;

public class BankingSystem {

    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount(12345, 1000);
        BankAccount Account2 = new BankAccount(67890, 500);

        System.out.println("Creating Bank Accounts:");
        System.out.println("Account 1: Account Number - " + Account1.getAccountNumber() + ", Initial Balance - $" + Account1.getBalance());
        System.out.println("Account 2: Account Number - " + Account2.getAccountNumber() + ", Initial Balance - $" + Account2.getBalance());
        System.out.println("Performing Transactions:");
        System.out.println("Depositing $200 into Account 1");
        Account1.setDeposit(200);
        System.out.println("Withdrawing $100 from Account 2");
        Account2.setWithdraw(100);
        System.out.println("Updated Account Information:");
        System.out.println("Account 1 - Balance: $"+Account1.getBalance());
        System.out.println("Account 2 - Balance: $"+Account2.getBalance());

    }
}
