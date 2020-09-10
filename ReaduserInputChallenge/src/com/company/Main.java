package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    int sum = 0;
	    Scanner s = new Scanner(System.in);
	    while (count <= 10){
            System.out.println("Enter number #" + count);
            boolean hasNextInt = s.hasNextInt();
	        if (hasNextInt){
                int input = s.nextInt();
                sum += input;
                count++;
            }
	        else {
                System.out.println("Invalid number");
            }
            s.nextLine();
        }
        System.out.println("Grand total of the numbers entered: " + sum);
	    s.close();
    }
}
