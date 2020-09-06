package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int total = 0;
	    for (int i =1; i <= 1000 && count <5; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("Number " + i + " is divisible by both 3 and 5.");
                count++;
                total += i;
            }
        }
        System.out.println("Grand Total = " + total);
    }
}
