package day44_AbstracClassAndInterface.animal;

import day46_FinalAndHiding.A;

public class Cat extends Animal implements Playable {
    @Override
    public void eat() {
        System.out.println(getName()+"is eating food");
    }

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {
        System.out.println(getName()+"is playing");
    }
public void meow(){
    System.out.println(getName()+"is meowing");
}
}
