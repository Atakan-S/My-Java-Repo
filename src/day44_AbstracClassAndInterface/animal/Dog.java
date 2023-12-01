package day44_AbstracClassAndInterface.animal;

import java.sql.SQLOutput;

public class Dog extends Animal implements Playable {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    @Override
    public void eat() {
        System.out.println(getName()+"eating food");
    }
public void play(){
    System.out.println(getName()+"is play a game");

}
public void bark(){
    System.out.println(getName()+"barking");
}

    @Override
    public String toString() {
        return "Dog{}"+ super.toString();
    }
}
