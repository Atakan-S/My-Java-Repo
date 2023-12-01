package day30_Week06_Review;

import java.util.Scanner;

public class C07_RoomRezerve {
    public static void main(String[] args) {
        int odafiyat =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Oda rezerve etmek istiyor musunuz: Evet/Hayır");
        String rezervasyon = scan.nextLine();
    while (!(rezervasyon.equals("evet")|| rezervasyon.equals("hayır"))){
        System.out.println("geçersiz cevap yeniden giriniz: Evet/Hayır");
        rezervasyon = scan.nextLine();
    }
    if (rezervasyon.equals("hayır")){
        System.out.println("iyi günler.");
    }else if (rezervasyon.equals("evet")){
        System.out.println("oda türü giriniz.");
        String odaturu = scan.nextLine();
        while (!(odaturu.equals("king bed")||odaturu.equals("queen bed")||odaturu.equals("single bed"))){
            System.out.println(("geçersiz cevap yeniden giriniz"));
            odaturu = scan.nextLine();
        }
         if (odaturu.equals("king bed")){
             odafiyat+=120;
         }if (odaturu.equals("queen bed")){
             odafiyat+=100;
         }if (odaturu.equals("single bed")){
             odafiyat+=80;
         }
        System.out.println(odaturu+" fiyatı "+odafiyat+"$");
    }
    }
}
    /*RoomReservation adında bir sınıf oluşturun, oda rezervasyonu için bir program yazın, programınız kullanıcıya oda rezerve etmek istediğini sorar.
        kullanıcı evet girdiyse kullanıcının hangi oda tipini rezerve etmek istediğini sorun. kullanıcı hayır girdiyse "iyi günler" yazdır
        (eğer kullanıcı herhangi bir geçersiz cevap (evet/hayır dışında) girdiyse, kullanıcı geçerli bir giriş sağlayana kadar kullanıcıdan tekrar girmesini isteyin)

        Kral Yatak ==> 120$
        Kraliçe Yatak ==> 100$
        tek kişilik Yatak ==> 80$

        program rezerve ettiği odayı ve odanın toplam fiyatını gösterebilmelidir.

        (kullanıcı geçersiz bir oda seçtiyse, kullanıcı geçerli bir giriş sağlayana kadar kullanıcıdan odayı yeniden seçmesini isteyin)

     */