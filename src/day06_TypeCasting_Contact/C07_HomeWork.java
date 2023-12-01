package day06_TypeCasting_Contact;

public class C07_HomeWork {
    public static void main(String[] args) {
        //Bir havuzu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        // c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        // Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar. (düzenlendi)
        double A = 12;
        double B = 30;
        double C = 9;

        double t = (1/A) + (1/B) - (1/C);
        double sonuç = 1/t;
        System.out.println(sonuç);



    }
}
