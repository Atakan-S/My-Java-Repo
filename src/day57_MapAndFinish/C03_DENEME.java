package day57_MapAndFinish;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class C03_DENEME {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(2,"ayşe");
        map.put(5,"fatma");
        map.put(15,"osman");
        map.put(12,"yahya");
        map.put(32,"samet");
        map.put(9,"muahhmed");
        System.out.println("map.entrySet() = " + map.entrySet());
        System.out.println("map.containsValue(2) = " + map.containsValue("ayşe"));
        System.out.println("map.containsKey(\"ayşe\") = " + map.containsKey(2));
        System.out.println("map.remove(2) = " + map.remove(2));
        System.out.println("map.entrySet() = " + map.entrySet());
        map.replace(5,"fatma","ahmet");
        System.out.println("map.entrySet() = " + map.entrySet());
       // map.clear();
       // System.out.println("map.entrySet() = " + map.entrySet());
    //put ekleme
        System.out.println("map.firstEntry() = " + map.firstEntry());
        System.out.println("map.lastEntry() = " + map.lastEntry());

    }
}
