package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class C05_Task {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(5,10,15,15,20,25,25,100,100,500));
        System.out.println("20 ye kadar random rakamlardan oluşan list="+random());
        System.out.println("--------------------------------");
        System.out.println("değerleri kendi ile çarpılan list="+squared(random()));
        System.out.println("--------------------------------");
        System.out.println("değerleri dublicate edilen list="+duplicate(arrayList));
    }
    public static ArrayList random(){
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            Integer randoms = random.nextInt(20);
            arrayList.add(randoms);
        }

        return arrayList;
    }
public static ArrayList squared(ArrayList arrayList){
    System.out.println(arrayList);
    for (int i = 0; i < arrayList.size(); i++) {
      int squared = (int) arrayList.get(i);

        arrayList.set(i,squared*squared);

    }
return arrayList;
    }
    public static ArrayList duplicate(ArrayList arrayList){
   int lenght = arrayList.size();
    System.out.println(arrayList);
    for (int i = 0; i < lenght; i++) {
        arrayList.add(arrayList.get(i));

    }
return arrayList;
    }
}
