package day14_NestedDoWhileLoops;

import java.util.Scanner;

public class C02_MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int min = Integer.MAX_VALUE;//max value en buyuk ınteger değeri demek
        for(int i=1;i<=5;i++){
        System.out.println("Sayı giriniz : ");
        int sayı = scan.nextInt();
     if (sayı<min){
         min=sayı;
     }
      }
        System.out.println("min value = "+min);
        //kullanıcıya 5 adet sayı alın en küçügü yazdırın
    }
}
