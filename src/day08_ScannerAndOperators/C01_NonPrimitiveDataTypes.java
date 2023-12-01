package day08_ScannerAndOperators;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String firstname = "Ahmet";
        String lastname = "Suat";

        firstname = "atakan";
        //primitive data tipleri sadece değer taşır.
        //nonprimitive data tipleri hem değer taşıyor hemde methodları var.
        int num1 = 10; // primitive
        //firstname yazıp nokto koydugumuzda bir çok method sunar yani nonprimitive farkı burdan gleır
        System.out.println(firstname.toUpperCase());//yaparsak hepsini buyuk harf yazar(nonprimitive methodlarına ornek)
        String text = "Buyuk harfe"+" Ingilizce'de "+ "Capital Letter"+" denir.";
        System.out.println(text);

        String not = "not";
        String Not = "Variable isimlendirmelerinde buyuk harfle baslamak yavsiye edilmez ama java bunu kabul eder";
        String nOt = "Bir kere tanimlanan bir degisken tekrar tanimlanamaz";
        String nOT = "isimler farkli olurssa java bunu kabul eder";



    }
}
