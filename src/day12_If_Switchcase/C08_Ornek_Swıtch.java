package day12_If_Switchcase;

import java.util.Scanner;

public class C08_Ornek_Swıtch {
    public static void main(String[] args) {
        // haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
        // 1 Pazartesi
        // 3  çarşamba
        // 7 Pazar
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanın kaçınvı gününde olduğunuzu giriniz.");
        int günsayı = scan.nextInt();
        switch (günsayı) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.err.println("sadece 1 den 7 ye kadar sayı girebilirsiniz.");
                break;
        }

    }

}
