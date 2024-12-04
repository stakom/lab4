package com.aquarium;

public class ClownFish extends Fish {
    public ClownFish(String name, int weight, Size size) {
        super(name, "Мирная", weight, size);
    }

    @Override
    public void swim() {
        System.out.println("The clown fish swims playfully around the coral.");
    }
}
