package day15_Week03_Review;

import java.util.Scanner;

public class C06_SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;
        while (true){
       System.out.println("Bir sayı giriniz : ");
       int num = scan.nextInt();
       sum+=num;
       if (num<0){
           System.out.println("sum = " + (sum-num));
           break;
       }

   }
    }
}
