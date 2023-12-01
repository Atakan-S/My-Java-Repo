package day23_StringClass;

import java.util.Scanner;

public class C06_Tasks2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 adet mesaj girin");
        String message1 = scan.nextLine();
        System.out.println(message1+" = "+bosluk(message1));
        System.out.println("-------------------------");
        System.out.println("TarihDamgası(21,09,2023,18,53,54) = " + TarihDamgası("21", "09", "2023", "18", "53", "54"));

    }
    public static String bosluk(String msg) {

        return msg.trim();
    }

    public static String TarihDamgası(String gün, String ay, String yıl, String saat, String dakikai, String saniye) {
        return gün.concat(ay).concat(yıl).concat(saat).concat(dakikai).concat(saniye);
    }

}
