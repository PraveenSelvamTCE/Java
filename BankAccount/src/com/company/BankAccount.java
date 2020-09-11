package com.company;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String emailId;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public String getEmailId(){
        return this.emailId;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double balance){
        System.out.println("Balance before adding '" + balance + "' : " + this.balance);
        this.balance += balance;
        System.out.println("Current Balance : " + this.balance);
    }

    public void withdraw(double balance){
        System.out.println("Balance before withdrawing '" + balance + "' : " + this.balance);
        if (this.balance >= balance){
            this.balance -= balance;
            System.out.println("Current Balance : " + this.balance);
        }
        else {
            System.out.println("Insufficient balance!");
        }
    }
}
