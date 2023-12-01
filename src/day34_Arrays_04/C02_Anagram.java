package day34_Arrays_04;

import java.util.Arrays;

public class C02_Anagram {
    public static void main(String[] args) {
        System.out.println("anagram(\"kil\",\"ilk\") = " + anagram("kil", "ilk"));
    }
    public static boolean anagram(String str1,String str2){
    char[] charArray = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
  Arrays.sort(charArray);
  Arrays.sort(charArray2);
 return Arrays.equals(charArray,charArray2);

}
}
// write a method that can check if str1 & str2 are build out same characters ANAGRAM
//kil  ilk
// adam dama