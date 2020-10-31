package com.company;

public class Benz extends Car {

    private int modelId;

    public Benz(String name, String color, String type, int speed, int gear, int horsepower, String fuelType, int modelId) {
        super(name, color, type, speed, gear, horsepower, fuelType);
        this.modelId = modelId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }
}
