package day57_MapAndFinish;

import java.util.*;

public class C01_MapExample1 {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("hatice","ozmen",15);
        Ogrenci ogrenci2 = new Ogrenci("kerem","ozmen",17);
        Ogrenci ogrenci3 = new Ogrenci("omer","ozmen",18);
        List<Ogrenci> list= new ArrayList<>();
        list.addAll(Arrays.asList(ogrenci,ogrenci2,ogrenci3));
        System.out.println("list = " + list);
        System.out.println("list.get(1) = " + list.get(1));
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getNo()==18){
               list.get(i).Dersekle("almanca");
           }

        }
        System.out.println("ogrenci3.getDersler() = " + ogrenci3.getDersler());
        Map<Integer,Ogrenci> ogrenciler = new HashMap<>();
        ogrenciler.put(ogrenci.getNo(),ogrenci);
        ogrenciler.put(ogrenci2.getNo(),ogrenci2);
        ogrenciler.put(ogrenci3.getNo(),ogrenci3);

        ogrenciler.get(17).Dersekle("ingilizce");
        ogrenciler.get(17).Dersekle("ingilizce");
        ogrenciler.get(17).Dersekle("ingilizce");
        ogrenciler.get(18).Dersekle("almanca");
        ogrenciler.get(15).Dersekle("turkce");
        ogrenciler.get(15).Dersekle("matematik");
        System.out.println("ogrenciler.get(17).getIsim() = " + ogrenciler.get(17).getIsim());
        System.out.println("ogrenciler.get(17).getDersler() = " + ogrenciler.get(17).getDersler());
        System.out.println("ogrenciler.get(15).getIsim() = " + ogrenciler.get(15).getIsim());
        System.out.println("ogrenciler.get(15).getDersler() = " + ogrenciler.get(15).getDersler());
        System.out.println("ogrenciler.get(17).toString() = " + ogrenciler.get(17).toString());

    }
}
