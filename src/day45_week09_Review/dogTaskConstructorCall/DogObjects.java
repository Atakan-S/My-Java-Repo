package day45_week09_Review.dogTaskConstructorCall;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog("max");
        Dog dog2= new Dog("max","pıtbull");
        Dog dog3= new Dog("max","pıtbull",3);
        Dog dog4= new Dog("max","pıtbull",3,"big");
        Dog dog5= new Dog("max","pıtbull",3,"big","black");
        System.out.println("dog1 = " + dog1);
        System.out.println("dog1 = " + dog2);
        System.out.println("dog1 = " + dog3);
        System.out.println("dog1 = " + dog4);
        System.out.println("dog1 = " + dog5);
    }
}
