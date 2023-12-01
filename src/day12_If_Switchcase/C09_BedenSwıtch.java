package day12_If_Switchcase;

import java.util.Scanner;

public class C09_BedenSwıtch {
    public static void main(String[] args) {
        //Bir program yazın switch yapısını kullanın.
// Şu beden numaralarını : small(38-40-42),
// medium(44-46-48), large(50-52-54) yakalasın. Aşağıdaki şekilde çıktı alın.
        //Example output: 50 numara bir large bedendir.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir beden giriniz : ");
        int beden = scan.nextInt();
        switch (beden){
            case 38,40,42:
                System.out.println(beden+" numara bir small bedendir.");
           break;
            case 44,46,48:
                System.out.println(beden+" numara bir medium bedendir.");
           break;
            case 50,52,54:
                System.out.println(beden+" numara bir large bedendir.");
            break;
                default:
                    System.out.println("böyle bir beden elimizde mevcut değil.");
                    break;
        }
    }
}
