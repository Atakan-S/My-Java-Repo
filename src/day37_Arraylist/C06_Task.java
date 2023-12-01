package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_Task {
    public static void main(String[] args) {
        ArrayList <String> stringNums = new ArrayList<>();
       stringNums.addAll(Arrays.asList("10","100","101","1000") );
        System.out.println("String numaraların Integer arrayListe çevirilmiş hali = "+toIntList(stringNums));
        System.out.println("String numaraların int arraye çevirilmiş hali = "+Arrays.toString(toIntArr(stringNums)));
    }
public static ArrayList toIntList(ArrayList stringNums){
    ArrayList <Integer> ıntNums = new ArrayList<>();
    for (int i = 0; i < stringNums.size(); i++) {
        ıntNums.add(Integer.parseInt((String) stringNums.get(i)));

    }
return ıntNums;
    }
    public static int[] toIntArr(ArrayList stringNums){
        int[] ıntArr = new int[toIntList(stringNums).size()];
        for (int i = 0; i < ıntArr.length; i++) {
            ıntArr[i]= (int) toIntList(stringNums).get(i);
        }

       return ıntArr;



    }
}
