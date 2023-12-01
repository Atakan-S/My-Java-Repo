package day44_AbstracClassAndInterface.animal;

import day45_week09_Review.animalTaskInheritance.Animal;
import day45_week09_Review.animalTaskInheritance.Cat;
import day46_FinalAndHiding.C;

public class MyZoo {
    public static void main(String[] args) {
        //Animal animal= new Animal("monkey","mammal",'m',15,"lage","black");
        // Abstract classlardan obje oluşturanazsın
//CanFly canFly = new CanFly() { // interface den obje oluşmaz

        day44_AbstracClassAndInterface.animal.Cat cat = new day44_AbstracClassAndInterface.animal.Cat("Tekir","scottish",'m',4,"medium","gray");
        System.out.println(cat);
        cat.setName("Bade");
        cat.eat();
cat.play();
cat.meow();
cat.setAge(5);
Dog dog = new Dog("karabaş","malakli",'m',7,"large","Black and White");
        System.out.println("dog = " + dog);
        dog.bark();
        dog.play();
        dog.setName("anabaş");
        dog.drinkWater();

   //   Animal animal = new Dog("aaa","aa",'m',3,"aa","aaa");
    }
}
