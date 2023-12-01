package day45_week09_Review.animalTaskInheritance;

public class Animal {
    public String name;
    public String bread;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String bread, int age, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
public void eat(){
    System.out.println(name+" is eating");
}
}
