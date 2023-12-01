package day45_week09_Review.dogTaskEncapsulation;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("max","pıtbull",3,"big","black");
        System.out.println("dog1 = " + dog1);
        //dog1.color(); olmaz çünkü private
        dog1.setColor("white");
        dog1.setAge(4);
        System.out.println("dog1 = " + dog1);

    }
}
