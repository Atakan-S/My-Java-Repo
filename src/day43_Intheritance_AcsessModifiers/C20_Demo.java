package day43_Intheritance_AcsessModifiers;

public class C20_Demo {
    public static void main(String[] args) {
        C22_Kare kare = new C22_Kare();
        kare.kenaruzunluğu=8;
        System.out.println(kare.alanHesapla());
        C23_Daire daire = new C23_Daire();
        daire.yariCap=5;
        System.out.println(daire.alanHesapla());
        C24_Ucgen ucgen = new C24_Ucgen();
        ucgen.yukseklik=10;
        ucgen.tabanUzunluğu=13;
        System.out.println(ucgen.alanHesapla());
    }
}
