package day45_week09_Review.dogTaskEncapsulation;

public class Dog {
    private String name;
    private String bread;
    private int age;
    private String size;
    private String color;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {

        return age;
    }


    public void setAge(int age) {
        if (age>1){
        this.age = age;
    }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
