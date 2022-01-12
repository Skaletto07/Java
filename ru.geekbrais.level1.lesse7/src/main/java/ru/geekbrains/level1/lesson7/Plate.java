package ru.geekbrains.level1.lesson7;

public class Plate {
    private int food;
    public int addFood;

    public Plate(int food) {
        if (food > 0) {
            this.food = food;
        } else
            System.out.println("The food cannot be less than 0 ");
    }

    public void addEat(int addFood) {
        this.addFood = addFood;
        this.food += addFood;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {

        if (food > 0 && food >= n) {
            food -= n;

        } else
            System.out.println("The food is over");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}


