package com.company;

public class Refrigerator {

    private int temperature;
    private String name;

    public Refrigerator(int temperature, String name) {
        this.temperature = temperature;
        this.name = name;
    }

    public void changeTemperature(int temperature){
        System.out.println("Temperature of Refrigerator changed to " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }
}
