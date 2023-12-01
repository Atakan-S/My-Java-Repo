package day40_Week08_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Task {
    public static void main(String[] args) {
        String[] arr1 ={"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList< String> arraylist=new ArrayList<>();
       arraylist.addAll(Arrays.asList(arr1));
        arraylist.addAll(Arrays.asList(arr2));

        System.out.println(arraylist);

    }
}
  /*  write a program that can combine two String arrays into one arrayList
                ex:
                        arr1 = {"A", "B", "C"};
                        arr2 = {"D", "E", "F", "G"};
                        list ==> {"A", "B", "C", "D", "E", "F", "G"}

   */