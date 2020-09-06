package com.company;

public class Main {

    public static void main(String[] args) {
	    char switchValue = 'e';
	    switch (switchValue){
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }
}
