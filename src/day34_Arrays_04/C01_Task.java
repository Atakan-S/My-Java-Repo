package day34_Arrays_04;

import java.util.Arrays;

public class C01_Task {
    public static void main(String[] args) {
       String str="merhaba java insanları bugün nasılsınız";
        System.out.println("Arrays.toString(stringToArray(str)) = " + Arrays.toString(stringToArray(str)));
        System.out.println("Arrays.toString(stringToArray2(\"kayısı, armut, üzüm, çilek, nar\")) = " + Arrays.toString(stringToArray2("kayısı, armut, üzüm, çilek, nar")));
    }
    //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[] stringToArray(String str){
        String[] strarr = str.split(" ");
    return strarr;

    }
    public static String[] stringToArray2(String str){
        String[] strarr = str.split(", ");
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].length()<5){
                strarr[i]="armut";
            }

        }
        return strarr;
    }
}
//«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//varsa onun yerine armut atayın.