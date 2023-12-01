package day53_Collections2;

import java.lang.reflect.Array;
import java.util.*;

public class C03_Setpractice {
    public static void main(String[] args) {
        String str ="  an  kara  ";
        // bu string içinde kac tane farklı harf var?
        System.out.println("uniqueCont(str) = " + uniqueCont(str));


    }
public static int uniqueCont(String str){
   str= str.replace(" ","");
        String [] array= str.split("");
    Set<String> set=new HashSet<>();
    set.addAll(Arrays.asList(array));
    return set.size();
}
}
