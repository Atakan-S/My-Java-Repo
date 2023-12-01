package day14_NestedDoWhileLoops;

import java.util.Scanner;

public class C01_Faktoriyel {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("Sayı : ");
        int num = scan.nextInt();
        int faktoriyel =1;
        for (int i=1;i<=num;i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(num+"! = "+faktoriyel);

}
}
