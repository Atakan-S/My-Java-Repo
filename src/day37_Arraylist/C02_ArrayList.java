package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        // add(); -- arraylist e veri eklemek için kullanılır

        arrayList.add("atakan");
        arrayList.add("ömer");
        arrayList.add("emre");
        System.out.println("arrayList = " + arrayList);
        //clear();__ list i temizler
        //--arrayList.clear();
        //get();
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.get(2) = " + arrayList.get(2));
        //System.out.println("arrayList.get(3) = " + arrayList.get(3));IndexOutOfBoundsException
        // Size(); --- lenght komutu gibi
        System.out.println("arrayList.size() = " + arrayList.size());
        System.out.println("arrayList.get(arrayList.size()-3) = " + arrayList.get(arrayList.size() - 3));
        //-------------------------------------------
        arrayList.add(0,"ahmet");
        System.out.println("arrayList = " + arrayList);
        //remove(); element kaldırır
        arrayList.remove(0);
        arrayList.remove("ahmet");

        System.out.println("arrayList = " + arrayList);
        //set(); yer değiştirir
        arrayList.set(0,"ahmet");
        System.out.println("arrayList = " + arrayList);
// indexOf(); girilen elementın hangı ındexte oldugunu gosterir
        System.out.println("arrayList.indexOf(\"ahmet\") = " + arrayList.indexOf("ahmet"));

    }
}
