package day34_Arrays_04;

import java.util.Arrays;

public class C03_ReverseSentence {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Today is a perfect day to learn Java"));
    }
public static String reverseSentence(String str){
        String reversed="";
        String strAr[]= str.split(" ");
    for (int i = strAr.length-1; i >= 0 ; i--) {
        reversed+=strAr[i]+" ";

    }
        return reversed;
}
}
/*
 Write a method that can reverse a sentence
 Ex:
 sentence = "Today is a perfect day to learn Java";

 output:
 Java learn to day perfect a is Today
 */