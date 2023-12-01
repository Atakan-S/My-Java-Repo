package day07_Aritmetic_Operators;


import java.util.Scanner;

public class C10_Scannerİntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kimya notu giriniz = ");
        int kimyanotu= scan.nextInt();
        System.out.println("fizik notu giriniz = ");
        int fiziknotu= scan.nextInt();
        System.out.println("mathematik notu giriniz = ");
        int matnotu= scan.nextInt();
        double ortalama = (double) (kimyanotu+fiziknotu+matnotu)/3;
        System.out.println("ortalama = " + ortalama);


    }
}
