package day56_LoopsAndMap;

import java.util.*;

public class C02_Loops_Set {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
set.add(25);
set.add(35);
set.add(6);
set.add(16);
        System.out.println("set = " + set);
        Set<Integer> set1=new HashSet<>();
        for (Integer a :set) {
            if (a>=25){
                set1.add(a);

            }
        }
        System.out.println("set1 = " + set1);
   //foreach method-----------------------------------------------------------------------
        List<String> list = Arrays.asList("Ahmet","Osman","Muhammed");
        for (String str:list) {
            System.out.println("str = " + str);
        }
        list.forEach(str-> System.out.println(str));
        set.forEach(y-> System.out.println(y));

        List<Integer> list1 = new ArrayList<>();
    set.forEach(y-> list1.add(y));
        System.out.println("list1 = " + list1);

    }
}
