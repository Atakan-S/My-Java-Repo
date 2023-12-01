package day26_String_Lab;

import java.util.Scanner;

public class C01_String_lab {
    public static void main(String[] args) {
        System.out.println("threeChar() = " + threeChar());
    }
    public static String threeChar(){
    Scanner scan = new Scanner(System.in);
    String kelime = scan.nextLine();
    int lenght = kelime.length();

    if(lenght>3){
         return kelime.substring(0,3);
    }else{
        return kelime;
    }
}
}
//Kullanıcıdan bir input alın ve girilen inputun ilk 3
// harfini yazan , 3 kelimeden az ise inputu döndüren bir metot yazınız.
//Merhaba Mer Ali Ali