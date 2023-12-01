package day52_Collections;

import java.util.*;

public class C01_Collections {
    public static void main(String[] args) {


    int[] arr= new int[5];
arr[0]=5;
arr[1]=10;
arr[2]=15;
arr[3]=20;
arr[4]=25;
//arr[5]=35; ArrayIndexOfBoundExpection hatası verir
        List<String> col2=  new ArrayList<>();
        List<Objects> col3=  new LinkedList<>();
        Queue<String> col4= new LinkedList<>();
        Queue<Objects> col5= new PriorityQueue<>();
        List<String> col6= new Vector<>();
        List<String> col7= new Stack<>();
        ((Stack)col7).push("ali");
        ((Stack)col7).push("veli");
        ((Stack)col7).push("Mehmet");
        ((Stack)col7).push("ahmet");
        System.out.println(col7);
        System.out.println(((Stack)col7).pop());// child class özelliği kullanacaksam casting yapmam lazım.
        System.out.println(col7);
        Set<String>coll8= new HashSet<>();
        Set<String>coll9= new TreeSet<>();
        Set<String>coll10= new LinkedHashSet<>();







}
}
