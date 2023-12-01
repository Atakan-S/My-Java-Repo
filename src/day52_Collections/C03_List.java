package day52_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_List {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println(list1);
        list1.add(5);
        System.out.println(list1);
        List<Integer> list2=new LinkedList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(30);
        System.out.println(list2);
        list2.remove(5);
        System.out.println(list2);
    }
}
