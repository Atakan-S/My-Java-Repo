package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("elma");
        arrayList.add("armut");
        arrayList.add("kayısı");
        arrayList.add("üzüm");
        arrayList.add("erik");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("armut");
        arrayList2.add("kayısı");
        arrayList2.add("üzüm");
        arrayList.removeAll(arrayList2);
        System.out.println("arrayList = " + arrayList);


    }
}
