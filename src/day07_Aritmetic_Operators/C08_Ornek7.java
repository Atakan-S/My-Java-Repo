package day07_Aritmetic_Operators;

public class C08_Ornek7 {
    public static void main(String[] args) {
        /*Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
vardır. Toplantıya 113 katılmıştır.
1.Toplantı salonun toplam kapasitesi nedir?
2.Kaç adet boş koltuk vardır ?
3.Kaç adet sırada oturulmaktadır ?
4. Kaç sıra tamamen boş kalmıştır.
5.Oturulan sıralarda kaç adet boş koltuk vardır?
*/
        int katılım=113;
        int sıra=15;
        int sırakoltuk=12;
        int koltuksys=sıra*sırakoltuk;
        System.out.println("1.soru = "+koltuksys);
        int boskltk = koltuksys-katılım;
        System.out.println("2.soru = "+boskltk);
        int kacsıra = katılım/sırakoltuk+1;
        int kacsıra2 = sıra-kacsıra;
        System.out.println("3.soru = "+kacsıra );
        System.out.println("4.soru = "+kacsıra2);
        int otrnkaçbslk = sırakoltuk-1;
        System.out.println("5.soru = "+otrnkaçbslk);

    }
}
