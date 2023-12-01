package day06_TypeCasting_Contact;

public class C05_AritmeticOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
       // int z = x + y; //27
        int z = x - y;
        //System.out.println("merhaba"+x-y); strıng ıfadeden sonra cıkarma olamz toplamadada yan yana yazar
        //System.out.println("merhaba"+x*y); ama çarpmada olur cunku carpmanın işlem onceliği vardır.
        double d = x/y; // veri kaybı yaşanır eğer veri kaybını onlemek istersek cast yapmak gerekir double d = (double) x/y;
        System.out.println(d);

  int sa = 3+5/2*4%(12-9);
        System.out.println(sa);

    }
}
