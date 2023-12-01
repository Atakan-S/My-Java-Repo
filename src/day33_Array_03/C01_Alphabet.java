package day33_Array_03;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {
        char [] alphabet;
        alphabet = new char[26];
        char ch='A';
        for (int i = 0; i < alphabet.length; i++ ) {
            alphabet[i]=ch;
            ch++;
        }
        System.out.println("alphabet = " + alphabet);
        System.out.println(Arrays.toString(alphabet));
        for (char c:alphabet) {
            System.out.print(c);
        }
        char ch1='Z';
        for (int i = 0; i < alphabet.length; i++ ) {
            alphabet[i]=ch1;
            ch1--;
        }
        System.out.println();
        System.out.println(Arrays.toString(alphabet));
        for (char c:alphabet) {
            System.out.print(c);
        }
    }
}
