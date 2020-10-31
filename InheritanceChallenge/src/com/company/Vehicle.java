package com.company;

public class Vehicle {

    private String name;
    private String color;
    private String type;
    private int speed;

    public Vehicle(String name, String color, String type, int speed) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public void movingAt(){
        System.out.println();
        System.out.println("Vehicle.move() called");
        System.out.println(this.name + " moving at " + this.speed + "mph speed");
    }

    public void increaseSpeed(int speed){
        System.out.println();
        System.out.println("Vehicle.increaseSpeed() called");
        System.out.println("Currently " + this.name + " is moving at " + this.speed + "mph speed.");
        this.speed += speed;
        System.out.println("Speed raised and now " + this.name + " is moving at " + this.speed + "mph speed");
    }

    public void decreaseSpeed(int speed){
        System.out.println();
        System.out.println("Vehicle.decreaseSpeed() called");
        if (speed < this.speed) {
            System.out.println("Currently " + this.name + " is moving at " + this.speed + "mph speed.");
            this.speed -= speed;
            System.out.println("Speed decreased and now " + this.name + " is moving at " + this.speed + "mph speed");
        }
        else {
            System.out.println(this.name + " was moving at " + this.speed + "mph speed previously and now it is stopped.");
            this.speed = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
