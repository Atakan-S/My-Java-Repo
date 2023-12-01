package day45_week09_Review.dogTaskConstructorCall;

public class Dog {
    public String name;
    public String bread;
    public int age;
    public String size;
    public String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String bread) {
        this(name);
        this.bread = bread;
    }

    public Dog(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public Dog(String name, String bread, int age, String size) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.size = size;
    }

    public Dog(String name, String bread, int age, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
