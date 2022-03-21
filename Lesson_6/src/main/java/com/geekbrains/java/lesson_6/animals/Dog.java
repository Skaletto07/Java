package com.geekbrains.java.lesson_6.animals;

public class Dog extends Animals {
    public Dog (String name){
        super(name);
    }

    @Override
    public void running(int run) {
        if (run > 0 && run <= 500 ) {
            System.out.println("Dog " + name + " running " + run + " meters.");
        } else if (run > 500) {
            System.out.println("Dog " + name + " running 500 meters, he can't run any further. He need a rest.");
        }
        else System.out.println(name + " don't running.");
    }

    @Override
    public void Swimming(int swim) {
        if (swim > 0 && swim <= 10 ) {
            System.out.println("Dog " + name + " running " + swim + " meters.");
        } else if (swim > 10) {
            System.out.println("Dog " + name + " drowned.");
        }
        else System.out.println(name + " don't running.");
    }
}
