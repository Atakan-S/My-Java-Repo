package day45_week09_Review.animalTaskInheritance;

import day41_Encapsulation_Static.Car;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("max","pıtbull",31,"small","purple");
        System.out.println("dog = " + dog);
        dog.eat();
        Cat cat = new Cat();

        cat.setInfo("bade","tekir",2,"small","white&grey");
        System.out.println("cat = " + cat);
        cat.eat();
    }
}
