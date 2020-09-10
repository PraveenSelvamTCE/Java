package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter a number:");
            boolean isAnInt = s.hasNextInt();
            if (isAnInt){
                int num = s.nextInt();
                if (num > max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
            }
            else {
                System.out.println("Minimum value entered = " + min);
                System.out.println("Maximum value entered = " + max);
                break;
            }
            s.nextLine();
        }

        s.close();
    }
}
