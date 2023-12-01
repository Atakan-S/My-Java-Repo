package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> numlist= new ArrayList<>();
        numlist.addAll(Arrays.asList(5,10,15));
        System.out.println(numlist);
    // convert ArrayList to Array
        Integer [] array = numlist.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(numlist.getClass());
    }
    }
