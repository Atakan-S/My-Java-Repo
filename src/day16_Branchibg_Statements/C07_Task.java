package day16_Branchibg_Statements;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program başladı");
        while(true){

        System.out.print("1.sayı = ");
        int sayı1 = scan.nextInt();
        System.out.print("2.sayı = ");
        int sayı2 = scan.nextInt();
    int sum = sayı1+sayı2;
           if (sayı1==0&&sayı2==0){
               break;
           }
           if (sum>25){
        System.out.println("sayılar toplamı 25 ten büyük tekrar deneyiniz");
        continue;
    }
            System.out.println("sum = " + sum);
        }
}
}
//Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2
// sayısının toplamı 25 ise programdan çıkış işlemi gerçekleştirin.
// 25 değil ise program kullanıcıdan iki sayı almaya devam etsin.