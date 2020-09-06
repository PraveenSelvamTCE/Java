package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number < 10){
            return -1;
        }
        else{
            while (number>10){
                sum += number % 10;
                number /= 10;
            }
            sum += number;
            return sum;
        }
    }
}
