package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C06_maxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numlist= new ArrayList<>();
        numlist.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Collections.max(numlist));
        Collections.reverse(numlist);
        System.out.println(numlist);

    }
}
/*
Write a program that can find the maximum number from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];
            output:
                5
 */