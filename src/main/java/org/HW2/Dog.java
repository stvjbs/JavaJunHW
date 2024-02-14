package org.HW2;

public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    private void makeSound() {
        System.out.println("Gau!!!");
    }
}
