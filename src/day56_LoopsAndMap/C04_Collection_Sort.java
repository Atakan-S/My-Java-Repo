package day56_LoopsAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_Collection_Sort {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,43,2,4,5,7,25);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("max(list) = " + max(list));

        System.out.println("list = " + list);

    }

public static int max (List<Integer> list){
        List<Integer> newlist= new ArrayList<>();
        newlist.addAll(list);
        Collections.sort(newlist);
        return newlist.get(newlist.size()-1);
}
}
