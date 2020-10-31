package com.company;

public class Main {

    public static void main(String[] args) {

        DiningTable diningTable = new DiningTable(4,"wood");

        Kitchen kitchen = new Kitchen(2, diningTable,3,new Refrigerator(17,"Onida"));

        kitchen.getDiningTable().movedChairs(5);
        kitchen.onRefrigerator();
    }
}
