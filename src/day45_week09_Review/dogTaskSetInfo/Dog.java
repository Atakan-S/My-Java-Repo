package day45_week09_Review.dogTaskSetInfo;

public class Dog {
    public String name;
    public String bread;
    public int age;
    public String size;
    public String color;
    public void setInfo(String dogName, String dogBreed,int dogAge,String dogSize,String dogColor){
name = dogName;
bread=dogBreed;
age=dogAge;
size=dogSize;
this.color=dogColor;
    }



    public void bark(){
    System.out.println(name+"is barking.");
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
