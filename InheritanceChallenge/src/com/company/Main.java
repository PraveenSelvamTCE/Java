package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Cycle","Blue","2 wheeler",5);
        Car c = new Car("Ford","Red","4 wheeler",10,4,200,"Petrol");
        Benz b = new Benz("Benz","White","4 wheeler",20,5,300,"Diesel",54001);


        v.movingAt();
        c.movingAt();
        b.movingAt();
        c.changeGear(3);
        b.increaseSpeed(100);
        v.decreaseSpeed(7);
    }
}
