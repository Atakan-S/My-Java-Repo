package day37_Arraylist;

import java.util.Arrays;

public class C01_Summary {
    public static void main(String[] args) {
        String str = "asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,////";
        System.out.println("Arrays.toString(returnString(str)) = " + Arrays.toString(returnString(str)));


    }

    /**
     * //" har/un b"
     * // 012345678
     * // Kriterler sayı olamaz,boşluk haricinde karakter olamaz sembol olamaz
     *
     * @param str
     * @return
     */
    public static boolean nameControl(String str) {
        String str1 = "^+!j4546*/-a_|v-:!a ???()&+";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)) || !Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == ' ') {
                    return false;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    /**
     * // asa0s1sdda12sa0sda1,210,as56sdada,ghf312fdg,////
     * /// task2 -- string içindeki sayıları bir array içinde döndüren bir method yazın
     * @param str
     * @return
     */
    public static int[] returnString(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                res += str.charAt(i);
            }
        }
        String[] arr = res.split("");
        int[] ıntarr = new int[res.length()];
        for (int i = 0; i < arr.length; i++) {

            ıntarr[i] = Integer.parseInt(arr[i]);
        }
        return ıntarr;
    }
}

