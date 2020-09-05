package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Maximum Float Value = " + myMaxFloatValue);
        System.out.println("Minimum Float Value = " + myMinFloatValue);
        System.out.println("Maximum Double Value = " + myMaxDoubleValue);
        System.out.println("Minimum Double Value = " + myMinDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("Integer Value = " + myIntValue);
        System.out.println("Float Value = " + myFloatValue);
        System.out.println("Double Value = " + myDoubleValue);

        double noOfPounds = 200d;
        double convertedKilogram = noOfPounds * 0.45359237d;
        System.out.println("Converted KiloGram = " + convertedKilogram);
    }
}
