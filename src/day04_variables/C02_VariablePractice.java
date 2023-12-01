package day04_variables;

public class C02_VariablePractice {
    public static void main(String[] args) {
        byte sinifMevcudu = 18;
        System.out.println(sinifMevcudu);
        System.out.print("sinifMevcudu = ");
        System.out.println(sinifMevcudu); // sout enter otomatık System.out.println yazar
        // üstte yazdığımız kodları aşşğıdaki şekilde tek satırda yazabiliriz
        System.out.print("sinifMevcudu = " + sinifMevcudu);
        //------------------------------------------------------------------
        long num3 = 9999999999l;
        System.out.println(num3);
        System.out.println(num3 + 1);
        // 1 ekleyerek tekrar yazar
        //-----------------------------------------
        short num1 = 30000;// 30.00 civarına kadar tanımlanabilir
        //--------------------------
        int num2 = 814578;// daha büyük tam sayılar için kullanılır
        // -------------------------
        char ch1 = 'A';
        System.out.println(ch1);
        //--------------------------
        boolean isMarried = true;
        System.out.println(isMarried);
        //--------------------------
        float piNUMBER = 3.14F;
        System.out.println("piNumber =" + piNUMBER);


    }

}
