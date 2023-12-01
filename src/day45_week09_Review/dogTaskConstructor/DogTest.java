package day45_week09_Review.dogTaskConstructor;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("lucky","Husky",3,"small","white");
        System.out.println("Dog.numberOfLegs = " + Dog.numberOfLegs);
dog1.name="max";
        System.out.println("dog1 = " + dog1);
        System.out.println("Dog.isFriendly = " + Dog.isFriendly);
    }
}
