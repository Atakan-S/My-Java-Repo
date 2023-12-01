package day11_ControlFlowStatements;

import java.util.Scanner;

public class C12_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A açısı : ");
        int A = scan.nextInt();
        System.out.println("B açısı : ");
        int B = scan.nextInt();
        System.out.println("C açısı : ");
        int C = scan.nextInt();
        int açılartop = A+B+C;
        if (açılartop>180){
            System.out.println("girdiğiniz değerler bir üçgene ait olamaz.");
    }
        else{
            System.out.println("Bu açılar bir üçgene ait.");
}
}
}

/*
        3 adet iç açı alsın ve
        bunun üçgen olup olmadığını kontrol etsin
         */