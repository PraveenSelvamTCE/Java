package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(1,0));
        System.out.println(getDurationString(3869));
    }

    public static String getDurationString(long minutes, long seconds){

        String hours = "";
        String min = "";
        String sec = "";
        if (minutes<0 || seconds < 0 || seconds > 59){
            return  "Invalid value";
        }
        else{
            long xx = (minutes/60);
            if (xx < 9){
                hours = "0" + xx + "h";
            }
            else {
                hours = "" + xx + "h";
            }
            long yy = (minutes % 60);
            if (yy < 9){
                min = "0" + yy + "m";
            }
            else {
                min = "" + yy + "m";
            }
            if (seconds < 9){
                sec = "0" + seconds + "s";
            }
            else {
                sec = "" + seconds + "s";
            }
            return (hours + " " + min + " " + sec);
        }
    }

    public static String getDurationString(long seconds){

        if (seconds < 0){
            return "Invalid value";
        }
        else{
            long min = seconds / 60;
            long reminingSeconds = seconds % 60;
            return getDurationString(min,reminingSeconds);
        }

    }
}
