package day35_Review;

import java.util.Arrays;

public class C11_ReverseSentence {
    public static void main(String[] args) {
        String str ="I love you";// I ovel you
        String strArray[]= str.split(" ");// I = 0 love = 1 you = 2

        String loveR="";
        for (int i = strArray[1].length() - 1; i >= 0; i--) {
            loveR+=strArray[1].charAt(i);
            System.out.println("loveR = " + loveR);
        }
           strArray[1]=loveR;
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));
        String strArrayNew[]= new String[strArray.length];
        for (int i = strArray.length - 1,j=0; i >= 0; i--,j++) {
            strArrayNew[j] =strArray[i];
        }
        System.out.println("Arrays.toString(strArrayNew) = " + Arrays.toString(strArrayNew));
    }

    }

