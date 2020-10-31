package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1, 5,10);

        Dog dog = new Dog("Mani",20,30,2,4,18,1,"Silky brown");

        Fish fish = new Fish("Goldie", 2, 10,3,2,3 );

        dog.run();
        fish.swim(5);

    }
}
