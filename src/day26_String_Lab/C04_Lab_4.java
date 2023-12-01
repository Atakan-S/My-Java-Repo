package day26_String_Lab;

public class C04_Lab_4 {
    public static void main(String[] args) {
        //System.out.println("threeChar(\"ATAKAN\") = " + threeChar("ATAKAN",4));
        //System.out.println("substring(\"atakan\",3) = " + substring("atakan", 3));
        //System.out.println("karakterSay(\"atakan\",'a') = " + karakterSay("atakan", 'a'));
        System.out.println("karaktersil(\"merhaba\",'a') = " + karaktersil("merhaba", 'a'));

    }

    public static String threeChar(String str, int adet) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String substring(String str, int index) {
        String res = "";
        for (int i = index; i < str.length(); i++) {
            res += str.charAt(i);
        }

        return res;
    }

    public static int karakterSay(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }

        }
        return count;
    }
public static String karaktersil(String kelime,char c){

       return kelime.replace(c+"","");
}
}
//Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
//Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii
//tek index  numarası alan substring metodunu yazınız
// "Merhaba"     str.substring(3)=haba
//  subString(String str,int index)
//Kullanıcıdan bir kelime ve bir karakter alın
// ve bu kelimenin istenen karakterin kaç adet olduğunu
// döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
//Ankara,a 3 Edirne,e 2
// Kullanıcıdan bir kelime ve bir harf alın
//    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
//    //(Merhaba, a) Merhb