package com.geekbrains.java.lesson_6.animals;


public class HomeWork6 {


        public static void main(String[] args){
            count ();

           Cat cat = new Cat("Barsik");
           Cat cat1 = new Cat("Ricky");
           Cat cat2 = new Cat("Rizhick");
           Dog dog = new Dog("Muhtar");
           Dog dog1 = new Dog("Maks");
           Dog dog2 = new Dog("Reks");
           cat.running(201);
           cat1.running(15);
           cat2.running(0);
           cat.Swimming(1);
           cat.Swimming(0);
           dog.running(333);
           dog1.running(0);
           dog2.running(510);
           dog1.Swimming(5);
           dog.Swimming(0);
           dog2.Swimming(11);

            count ();
        }

        public static void count() {
            System.out.println("Всего создано объектов, животных " + Animals.countAn);
        }





}
