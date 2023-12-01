package day07_Aritmetic_Operators;

public class C09_Ornek8 {
    public static void main(String[] args) {
        //31502 saniye kaç saat kaç dakika kaç saniyedir?
        // (1 saat 60 dakika 1 dakika 60 sn)
    int saniye = 31502;
    int saat = 3600; // 3600 saniye 1 saat
    int dk = 60; // 60 saniye 1 dk
        int saatbulma= saniye%saat;
        int saatbulma2= saniye/saat;
        System.out.println("saat = "+saatbulma2);
        int dkbulma = saatbulma/dk;
        System.out.println("dakika = "+dkbulma);
        int dkbulma2= saatbulma%dk;
        System.out.println("saniye = "+dkbulma2);


    }
}
