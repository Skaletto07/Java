package com.geekbrains.java.lesson_6.animals;

public class Animals {

    protected String name;
    protected int run;
    protected int swim;
    public static int countAn = 0;


    public Animals() {

    }

    public Animals (String name) {
        this.name = name;
        countAn++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void running(int run) {
        if (run > 0 ) {
            System.out.println(name + " running " + run + " meters.");
        }
        System.out.println(name + " don't running.");
    }

    public void Swimming(int swim) {
        if (swim > 0 ) {
            System.out.println(name + " swimming " + swim + " meters.");
        }
        System.out.println(name + " don't running.");
    }

}