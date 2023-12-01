package day39_ConstructorOverloading;

public class student {
    public String name;
    public int age;
    public char gender;
    public int id;


    public student(String name, char gender, int age,int id){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public student() {

    }

    @Override


    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
