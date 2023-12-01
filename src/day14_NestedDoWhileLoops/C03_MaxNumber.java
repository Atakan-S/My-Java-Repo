package day14_NestedDoWhileLoops;

import java.util.Scanner;

public class C03_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;//mın value en kucuk ınteger değeri demek
        for(int i=1;i<=5;i++){
            System.out.println("Sayı giriniz : ");
            int sayı = scan.nextInt();
            if (sayı>max){
                max=sayı;
            }
        }
        System.out.println("min value = "+max);
    //kullanıcıya 5 adet sayı alın en buyugunu yazdırın
    }
}
