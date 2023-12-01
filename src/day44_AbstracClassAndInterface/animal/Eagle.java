package day44_AbstracClassAndInterface.animal;

import day46_FinalAndHiding.A;

public class Eagle extends Animal implements Wild,CanFly {
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"is eating");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+"is hunting");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"is flying at high mountains");
    }
}
