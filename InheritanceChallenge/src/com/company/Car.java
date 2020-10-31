package com.company;

public class Car extends Vehicle{

    private int gear;
    private int horsepower;
    private String fuelType;

    public Car(String name, String color, String type, int speed, int gear, int horsepower, String fuelType) {
        super(name, color, type, speed);
        this.gear = gear;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public void changeGear(int gear){
        System.out.println();
        System.out.println("Car.changeGear() called");
        System.out.println(super.getName() + " at " + this.gear + "th gear and changed to " + gear + "th gear" );
        this.setGear(gear);
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
