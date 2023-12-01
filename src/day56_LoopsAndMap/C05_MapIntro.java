package day56_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C05_MapIntro {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        //BİYERDE KÖŞELİ PARANTEZ İÇİNDE VERİ GÖRÜRSEK O LİSTİR
        students.put("YUSUF", 24);
        students.put("BURCU", 21);
        students.put("OSMAN", 27);
        students.put("ATAKAN", 18);
        System.out.println("students = " + students);
        //SÜSLÜ PARANTEZ GÖRÜRSENİZ AKLINIZA MAP GELECEK
        Map<String, Integer> students1 = new TreeMap<>();
        students1.put("YUSUF", 24);
        students1.put("BURCU", 21);
        students1.put("OSMAN", 27);
        students1.put("ATAKAN", 18);
        students1.put("YUSUF", 18);
        System.out.println("students1 = " + students1);
        //-----------------------------------------------------------------
        System.out.println("students1.get(\"YUSUF\") = " + students1.get("YUSUF"));
        System.out.println("students1.keySet() = " + students1.keySet());//KEYLERİ VERİYOR
        for (String name:students1.keySet()) {
            System.out.println(name+" : "+students1.get(name));


        }
        System.out.println("students1.remove(\"ATAKAN\",18) = " + students1.remove("ATAKAN", 18));
        System.out.println("students1.get(\"ATAKAN\") = " + students1.get("ATAKAN"));
        System.out.println("students1.containsKey(\"ATAKAN\") = " + students1.containsKey("ATAKAN"));
        System.out.println("students1.containsKey(27) = " + students1.containsValue(27));
        students1.clear();
        System.out.println("students1 = " + students1);

    }
}
