package day55_Rewiev;

import java.util.*;

public class C02_ListPractice {
    public static void main(String[] args) {
        List<Integer> numlist = new LinkedList<>();
        numlist.addAll(Arrays.asList(5,10,15,20,25,25));
        System.out.println("numlist = " + numlist);
        numlist.add(8);
        System.out.println("numlist = " + numlist);
        Collections.sort(numlist);
        System.out.println("numlist = " + numlist);

        numlist.remove(numlist.size()-1);
        System.out.println("numlist = " + numlist);
        numlist.removeAll(Arrays.asList(15));

    }
}
