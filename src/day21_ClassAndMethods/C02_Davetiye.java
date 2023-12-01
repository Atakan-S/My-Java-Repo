package day21_ClassAndMethods;

import java.util.Scanner;

public class C02_Davetiye {
    public static void main(String[] args) {
        davetiye();
    }

    private static void davetiye() {
      outloop :while (true) {
          Scanner scan = new Scanner(System.in);
          System.out.println("1.kelime");
          String kelime1 = scan.nextLine();
          System.out.println("2.kelime");
          String kelime2 = scan.nextLine();
          if (kelimekontrol(kelime1, kelime2) == true) {
              System.out.println("kelimeler farklı olmalıydı");
              continue;
          }else {
              davetiyeyazdır(kelime1,kelime2);
          return;
          }
      }
    }

    private static void davetiyeyazdır(String kelime1,String kelime2) {

        System.out.println("********"+kelime1+"*********"+kelime2+"********");
    }

    public static boolean kelimekontrol(String kelime1,String kelime2){
        boolean res = kelime1.equals(kelime2);
        return res;
    }
}
//Kullanıcıdan
//2 adet kelime isteyen bir metodunuz olsun Bu metot
//kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun Eğer
//kullanıcı cümleleri yanlışlıkla aynı girerse Başka bir metot çağrılsın ve
//kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
//istesin Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
//bağlayıp( concat önünü ve arkasını yıldızlarla süsleyip versin