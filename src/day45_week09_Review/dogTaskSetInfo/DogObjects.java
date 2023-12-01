package day45_week09_Review.dogTaskSetInfo;

import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {


    Dog dog1 =new Dog();
dog1.name="Max";
dog1.age=2;
dog1.size="small";
dog1.bread="bulldog";
dog1.color="brown";


        System.out.println("dog1 = " + dog1);

        Dog dog2 =new Dog();
        dog2.setInfo("max","bulldog",2,"small","yellow");
        System.out.println("dog2 = " + dog2);
        dog2.bark();
        Dog[] dogs={dog1,dog2};
        System.out.println("Arrays.toString(dogs) = " + Arrays.toString(dogs));
        System.out.println("dogs[0] = " + dogs[0]);
        int[] arr={2,4};


    }
}
