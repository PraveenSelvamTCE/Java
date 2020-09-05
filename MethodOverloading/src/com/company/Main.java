package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches >12){
            return -1;
        }
        else{
            double centimeters = 2.54 * (feet * 12);
            centimeters += inches * 2.54;
            return centimeters;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        else{
            double feet = (int) inches / 12;
            double reminingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet,reminingInches);
        }
    }
}
