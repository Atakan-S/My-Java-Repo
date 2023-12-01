package day56_LoopsAndMap;

import java.util.ArrayList;
import java.util.List;

public class C01_Loops_list {
    /*
    1.For,While,do While
    2.For each
    3. Iterator (lambda expression)
    4. forEach()
     */
    public static void main(String[] args) {
        String [] arr={"Burcu","Samet","Osman"};
        int ab=1;
        for (String a:arr) {
            //System.out.println(ab+++" = " + a);
        }
        for (int i = 0; i < arr.length; i++) {
           // System.out.println("arr[i] = " + arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(6);
        list.add(16);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        for (Integer sayı: list) {
            System.out.println("sayı = " + sayı);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
    //25 ten küçük olan sayıları sil listi ekrana yazdır

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<25){
                list.remove(list.get(i));
                i--;
            }
            System.out.println("list = " + list);
        }

    }
}
