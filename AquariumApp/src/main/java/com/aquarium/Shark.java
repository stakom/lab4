package com.aquarium;

public class Shark extends Fish {
    public Shark(String name, double weight, Size size) {
        super(name, "Хищная", weight, size);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывёт быстро!");
    }
}
