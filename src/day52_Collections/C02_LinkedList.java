package day52_Collections;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String>letters= new LinkedList<>();//collection sınıfı primitive data sınıfı kullanmaz

        letters.add("K");
        letters.add("R");
        letters.add("A");
        letters.add("F");
        letters.add("T");
        letters.add("T");
        letters.add("E");
        letters.add("C");
        letters.add("H");
        System.out.println(letters);
        System.out.println(letters.indexOf("R"));
        letters.add("N");
        letters.add("I");
        letters.add("C");
        System.out.println(letters);
        System.out.println(letters.indexOf("R"));
        letters.set(letters.size()-1, "K");
        System.out.println(letters);
        List<String>target= new LinkedList<>();
        target.addAll(Arrays.asList("R","T","L"));
        System.out.println(target);
        System.out.println(letters.containsAll(target));
        System.out.println(letters.retainAll(Arrays.asList("A", "B", "C", "D", "E", "F","T")));
        System.out.println(letters);

    }
}
