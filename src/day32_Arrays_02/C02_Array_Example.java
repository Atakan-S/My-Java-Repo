package day32_Arrays_02;

import java.util.Scanner;

public class C02_Array_Example {
    //kullanıcıdan 3 adet kelime alın ve bu 3 farklı kelimeyi
    // array içerisine atalım
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kelime girin.");
        String kelime1 = scan.nextLine();
        System.out.println("ikinci kelime girin.");
        String kelime2 = scan.nextLine();
        System.out.println("üçüncü kelime girin.");
        String kelime3 = scan.nextLine();
        String[] array = new String[3];
        array[0] = kelime1;
        array[1] = kelime2;
        array[2] = kelime3;
        System.out.println("girilen kelimelerden hangisini istersin.1-2-3");
        int tercih = scan.nextInt();
        switch (tercih) {
            case 1:
                System.out.println(array[0]);
                break;
            case 2:
                System.out.println(array[1]);
                break;
            case 3:
                System.out.println(array[2]);
                break;
            default:
                System.out.println("hatalı giriş.");

        }
    }
}
