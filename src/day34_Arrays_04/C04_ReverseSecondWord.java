package day34_Arrays_04;

import java.util.Arrays;

public class C04_ReverseSecondWord {
    public static void main(String[] args) {

    }
    public static String[] reverseSentence(String str){
        String reversed="";
        String strAr[]= str.split(" ");
        for (int i = strAr.length-1; i >= 0 ; i--) {
            reversed+=strAr[i]+" ";

        }
        String reversedArr[]={reversed};
        return reversedArr;
    }
    public static String reverseSecondWord(String str[]){
        String result="";
        String[] newArr2= str[1].split("");

        for (int i = 4; i >=0 ; i--) {
            result+=newArr2[i];

        }
        return str[1]=result;


    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */