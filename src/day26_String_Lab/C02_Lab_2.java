package day26_String_Lab;

public class C02_Lab_2 {
    public static void main(String[] args) {
        System.out.println("yüzdeekle(\"merhaba   dünya     \") = " + yüzdeekle("merhaba   dünya     "));
        System.out.println("yarısınıdöndür(\"Merhabadünya\") = " + yarısınıdöndür("Merhabadünya"));
    }
    public static String yüzdeekle (String x){
       return x.replace(" ","%");

    }
public static  String yarısınıdöndür(String str){
        int l = str.length()/2;
       return str.substring(l,str.length());
}
}
//Kullanıcıdan bir dize sözcük alın ve her
// boşluğa % ibaresi ekleyin. Merhaba dünya Merhaba%dünya
// "   merhaba dünya  "   %%%merhaba%dünya%%



//Kullanıcın girdiği bir kelimenin 2. yarısını
// döndüren bir program yazdırın.
//Sanayagı yagı Mutluluk uluk