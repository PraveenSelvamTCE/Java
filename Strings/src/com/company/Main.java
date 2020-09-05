package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "'This is a string";
        System.out.println("myString is " + myString);
        myString = myString + ", and this is more'";
        System.out.println("myString is " + myString);
        myString = myString + "\u00a9 2020";
        System.out.println("myString is " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString is" + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is " + lastString);
        double myDouble = 12.5;
        lastString = lastString + myDouble;
        System.out.println("lastString is " + lastString);
    }
}
