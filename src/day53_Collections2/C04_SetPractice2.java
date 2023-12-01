package day53_Collections2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_SetPractice2 {
    public static void main(String[] args) {


    String [] arr={"book","Notebook","food","pencilcase","book","book","book","pen","spoon","mirror","spoon","watherbottle","phone","phone"};
        System.out.println("arr.length = " + arr.length);
        Set<String> uniqueItemInMyBag= new HashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemInMyBag.size() = " + uniqueItemInMyBag.size());

    }
}
