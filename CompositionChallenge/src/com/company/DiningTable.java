package com.company;

public class DiningTable {

    private int chairs;
    private String component;

    public DiningTable(int chairs, String component) {
        this.chairs = chairs;
        this.component = component;
    }

    public void movedChairs(int chairs){
        System.out.println("Chairs moved = " + chairs);
    }

    public int getChairs() {
        return chairs;
    }

    public String getComponent() {
        return component;
    }
}
