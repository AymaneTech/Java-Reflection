package com.geek.reflection.Animal;

public class Goat extends Animal implements Locomotion {
    private String name;

    public Goat() {
    }

    public Goat(String name) {
        this.name = name;
    }

    @Override
    protected String getSound() {
        return "bleat";
    }

    @Override
    public String eats() {
        return "grass";
    }

    @Override
    public String getLocomotion() {
        return "walks";
    }
}
