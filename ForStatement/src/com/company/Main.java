package com.company;

public class Main {

    public static void main(String[] args) {

        /*for (int i=2; i <9; i++){
            System.out.println(calcInterest(10000.0,i));
        }*/
        int primeCount = 0;
        for (int i = 37241; i < 400000 && primeCount <3; i++){
            if(isPrime(i)){
                System.out.println(i + " is a Prime Number");
                primeCount++;
            }

        }

    }

    public static double calcInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }

    public static boolean isPrime(int num){

        if (num ==1 || num ==0){
            return false;
        }
        else{
            for (int i=2; i<=num/2 ; i++){
                if(num%i == 0){
                    return false;
                }
            }
        return true;
        }
    }
}
