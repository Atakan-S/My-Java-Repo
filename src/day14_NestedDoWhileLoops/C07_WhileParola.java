package day14_NestedDoWhileLoops;

import java.util.Scanner;

public class C07_WhileParola {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    String parola = "atakan";
    String tahmin = "";
        System.out.println("Parolayı tahmin ediniz (Toplam 3 hakkınız var) : ");
        int hak =4;
        int i =1;
        while (i<=3){{
        i++;
            tahmin = scan.nextLine();
        if (tahmin.equalsIgnoreCase(parola)){
            System.out.println("Tebrikler Parolayı bildiniz.");
            break;
        }else{
            System.out.println("Parola Yanlış Lütfen tekrar deneyiniz kalan hakkınız : "+(hak-i));

        }
        }
        }

}
}
