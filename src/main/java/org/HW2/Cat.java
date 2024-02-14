package org.HW2;

public class Cat extends Animal {
    int weight;

    public Cat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    private void makeSoundAnother() {
        System.out.println("Meooow!!!");
    }
}
