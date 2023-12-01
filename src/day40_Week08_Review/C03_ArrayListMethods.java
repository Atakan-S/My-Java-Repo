package day40_Week08_Review;

import java.util.ArrayList;

public class C03_ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("JavaScript");
        names.add("C#");
        System.out.println("names = " + names);
        names.set(2, "Phyton");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.remove("JavaScript");
        System.out.println(names);
        ArrayList<Integer> nums = new ArrayList<>();

    }
}
