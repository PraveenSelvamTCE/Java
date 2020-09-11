package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	    BankAccount acc = new BankAccount();

	    acc.setAccountNumber(5001);
	    acc.setBalance(100000.00);
	    acc.setCustomerName("Praveen");
	    acc.setEmailId("praveenselvamrce@gmail.com");
	    acc.setPhoneNumber(8870209);

        System.out.println("Printing account details : ");
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("A/C no : " + acc.getAccountNumber());
        System.out.println("Customer Name : " + acc.getCustomerName());
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Email ID : " + acc.getEmailId());
        System.out.println("Ph. No : " + acc.getPhoneNumber());
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();

        System.out.println("---------------------------------------------------------");
        System.out.println("Depositing 1000 to A/C - " + acc.getAccountNumber());
        acc.deposit(1000);
        System.out.println("---------------------------------------------------------");

        System.out.println("---------------------------------------------------------");
        System.out.println("Withdrawing 11000 from A/C - " + acc.getAccountNumber());
        acc.withdraw(11000);
        System.out.println("---------------------------------------------------------");
    }
}
