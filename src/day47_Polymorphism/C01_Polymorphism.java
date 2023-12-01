package day47_Polymorphism;

import day44_AbstracClassAndInterface.animal.Animal;
import day44_AbstracClassAndInterface.animal.Cat;
import day44_AbstracClassAndInterface.animal.Dog;
import day46_FinalAndHiding.A;

public class C01_Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog("Panco","golden",'m',10,"medium","gold");
        Dog dog = new Dog("Panco2","golden",'m',10,"medium","gold");
        boolean isAnımal = animal instanceof Animal;
        System.out.println("isAnımal = " + isAnımal);
        boolean isDog = animal instanceof Dog;
        System.out.println("isDog = " + isDog);
        boolean isCat= animal instanceof Cat;
        System.out.println("isCat = " + isCat);
        System.out.println("------------------------");
        animal.eat();
        animal.drinkWater();
        System.out.println("------------------------");
        ((Dog)animal).bark();// down casting
        ((Dog)animal).play();// child ozelliklerine ulaşabilmek için casting yapmak zorundayız
        animal = new Cat("tekir","golden",'m',10,"medium","gold");
        animal.eat();
        ((Cat)animal).meow();
       Cat cat = new Cat("Panco","golden",'m',10,"medium","gold");
        Animal animal1= cat;
        animal1.eat();


    }
}
