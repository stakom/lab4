package com.aquarium;

public class Piranha extends Fish {
    public Piranha(String name, int weight, Size size) {
        super(name, "Хищная", weight, size);
    }

    @Override
    public void swim() {
        System.out.println("The piranha swims quickly, ready to hunt.");
    }
}
