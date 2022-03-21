package com.geekbrains.java.lesson_6.animals;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void running(int run) {
        if (run > 0 && run <= 200 ) {
            System.out.println("Cat " + name + " running " + run + " meters.");
        } else if (run > 200) {
            System.out.println("Cat " + name + " running 200 meters, he can't run any further.");
        }
        else System.out.println(name + " don't running.");
    }

    @Override
    public void Swimming(int swim) {
            System.out.println("The cats can't swim. She'll drown.");

    }
}
