package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_Swap {
    public static void main(String[] args) {
        ArrayList<Integer> numlist= new ArrayList<>();
        numlist.addAll(Arrays.asList(1,2,3,4,5));
        int temp= numlist.get(0);
        numlist.set(0,numlist.size()-1+1);
        numlist.set(numlist.size()-1,temp);
        System.out.println(numlist);
    }
}
