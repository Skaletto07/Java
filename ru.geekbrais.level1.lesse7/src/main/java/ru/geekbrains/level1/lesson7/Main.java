package ru.geekbrains.level1.lesson7;

public class Main {
    public static Cat[] catArr = new Cat[10];
    public static void main(String[] args) {
        createCats();

        Plate plate = new Plate(15);
        plate.info();
        for (int i = 0; i< catArr.length; i++){
            catArr[i].eat(plate);
            plate.info();
        }
        catSatiety();
        plate.addEat(50);
        System.out.println(plate.getFood());
    }

    public static void createCats() {
        catArr[0] = new Cat("Барсик", 5);
        catArr[1] = new Cat("Рики", 2);
        catArr[2] = new Cat("Макс", 10);
        catArr[3] = new Cat("Рыжик", 8);
        catArr[4] = new Cat("Черныш", 4);
        catArr[5] = new Cat("Тузик", 2);
        catArr[6] = new Cat("Грелка", 3);
        catArr[7] = new Cat("Джордж", 6);
        catArr[8] = new Cat("Джерри", 11);
        catArr[9] = new Cat("Том", 7);
    }

    public static void catSatiety(){
        for (int i = 0; i< catArr.length; i++){
            System.out.println(catArr[i].isSatiety());
        }
    }
}

