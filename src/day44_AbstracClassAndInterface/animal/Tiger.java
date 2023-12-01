package day44_AbstracClassAndInterface.animal;

import day46_FinalAndHiding.A;

public class Tiger extends Animal implements Wild {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating a deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+"is hunting.");
    }

}
