package day30_Week06_Review;

public class C04_NSubstring {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;
        System.out.println("NSubstring(str,n) = " + NSubstring(str, n));
    }
public  static boolean NSubstring(String str,int n){
    if (str.substring(n).contains(str.substring(0,n))){
        return true;
    }
        return false;
}
}
    /*
    Given a String str and a number n check if the prefix (made of up of the

        first n characters) appears in the remaining part of the String. Print true
        or false.*
        Assume that the String is not empty and that n is in the range from 1 to
        str.length().*
        Examples:*
        input: abXYabc
        *
        input: 1
        *
        output: true
        *
        input: abXYabc
        *
        input: 2
        *
        output: true
        *
        input: abXYabc
        *
        input: 3
        *
        output: false
        */