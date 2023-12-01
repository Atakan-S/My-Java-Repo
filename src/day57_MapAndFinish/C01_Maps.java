package day57_MapAndFinish;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        //hızlı işlem için kendi algoritmasına göre verileri sıralar
        Map<Integer,String> hmap= new HashMap<>();
        hmap.put(2,"ayşe");
        hmap.put(5,"fatma");
        hmap.put(15,"osman");
        hmap.put(12,"yahya");
        hmap.put(32,"samet");
        hmap.put(9,"muahhmed");
        System.out.println("hmap = " + hmap);
        //Ekleme sırasına göre depolar
        Map<Integer,String> Lhmap= new LinkedHashMap<>();
        Lhmap.put(2,"ayşe");
        Lhmap.put(5,"fatma");
        Lhmap.put(15,"osman");
        Lhmap.put(12,"yahya");
        Lhmap.put(32,"samet");
        Lhmap.put(9,"muahhmed");
        System.out.println("Lhmap = " + Lhmap);

       //herzaman KEY değerlerine göre sıralar
        Map<Integer,String> treemap= new TreeMap<>();
        treemap.put(2,"ayşe");
        treemap.put(5,"fatma");
        treemap.put(15,"osman");
        treemap.put(12,"yahya");
        treemap.put(32,"samet");
        treemap.put(9,"muahhmed");
        System.out.println("Lhmap = " + treemap);
        System.out.println("treemap.entrySet() = " + treemap.entrySet());

    }

}
