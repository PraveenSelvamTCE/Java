package com.company;

public class Kitchen {

    private int stove;
    private DiningTable diningTable;
    private int light;
    private Refrigerator refrigerator;

    public Kitchen(int stove, DiningTable diningTable, int light, Refrigerator refrigerator) {
        this.stove = stove;
        this.diningTable = diningTable;
        this.light = light;
        this.refrigerator = refrigerator;
    }

    public void onRefrigerator(){
        refrigerator.changeTemperature(12);
    }

    public int getStove() {
        return stove;
    }

    public DiningTable getDiningTable() {
        return diningTable;
    }

    public int getLight() {
        return light;
    }

}
