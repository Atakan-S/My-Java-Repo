package day09_OperatorsContine;

import java.util.Scanner;

public class C07_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dairenin yarı çapını giriniz. ");
        int r = scan.nextInt();
        scan.nextLine();
        double pı = 3.14;
        double cevre = 2*pı*r;
        double alan = pı*r*r;
        System.out.println(r+" cm yarıçaplı dairenin cevresi; "+cevre+" cm dir alanı ise "+alan+" cm2 dır.");
        }



}
