package Array_Lab;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 3, 3, 6, 6, 5, 6, 3, 6, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("duplicateSentence(\"araba ile yola çıktık fakat araba arıza yaptı\") = " + duplicateSentence("araba ile yola çıktık fakat araba arıza yaptı"));
        System.out.println("duplicateSentence(\"araba ile yola çıktık fakat arıza yaptı\") = " + duplicateSentence("araba ile yola çıktık fakat arıza yaptı"));
    }

    public static boolean duplicateSentence(String str){
        String strArray[]=str.split(" ");

        for (int i = 0,k=i+1; i < strArray.length; i++,k++) {
             k=i+1;
            for (int j = 0; j < strArray.length; j++,k++) {
                if (k<strArray.length){
                if (strArray[i].equals(strArray[k])){
                    return true;
                }
                }

            }
        }
        return false;
    }
}
