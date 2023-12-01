package day12_If_Switchcase;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // byte , short , int , string , char tipindeki değişkenleri karşılaştırmak için kullanılır
        int sayi = 4;
        switch (sayi) {
            case 1:
                System.out.println("doğru");
                break;
            case 2:
                System.out.println("yanlış");
                break;
            case 3:
                System.out.println("olabilir");
                break;
            default:
                System.out.println("veri yok");

        }

    }
}
