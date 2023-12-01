package day35_Review;

import java.util.Arrays;

public class C12_StringMethodsToArray {
    public static void main(String[] args) {
        String s = "java";
        char[] charArray = s.toCharArray();
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s.toCharArray()));
        for (char each:charArray) {
            System.out.println("each = " + each);
        }
        System.out.println("------------------------");
        String str= "Bugün cuma. Bugun hava sıcak. Yarın daha soğuk olacak";
        String[] s1=str.split("\\.");
        System.out.println("Arrays.toString(s1) = " + Arrays.toString(s1));

    }
}
