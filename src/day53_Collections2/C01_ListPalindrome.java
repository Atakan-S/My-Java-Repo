package day53_Collections2;

import java.util.*;

public class C01_ListPalindrome {
    public static void main(String[] args) {
        List <String> arrayList = new ArrayList<>();
        List <String> arrayList2 = new ArrayList<>();
        String [] array={"kazık","adanada","kazak","radar","ses","harun","ses","radar","aga","ada","ada"};
        arrayList.addAll(Arrays.asList(array));

        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i), reverse(arrayList.get(i)))){
                arrayList2.add(arrayList.get(i));
            }
        }


        System.out.println("palindrom(arrayList2) = " + palindrom(arrayList2));

    }
public static String palindrom(List<String> s2){
    Set <String> treelist= new TreeSet<>();
    treelist.addAll(s2);
    return treelist.toString();

}
public static String reverse(String s){
     String[] s_split=s.split("");
     String s2 ="";
    for (int i = s.length()-1, a = 0; i > -1; i--,a++) {
        s2 += s_split[i];

    }
return s2;
    }
}
//list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
// metodu yazınız.(aynı kelimeleri ekrana yazma-sın)
//kazık,adanada,kazak,radar,ses,harun,ses,radar,aga,ada,ada
//adanada,kazak,radar,ses,aga,ada