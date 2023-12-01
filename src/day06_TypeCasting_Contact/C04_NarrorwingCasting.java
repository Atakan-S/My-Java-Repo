package day06_TypeCasting_Contact;

public class C04_NarrorwingCasting {

    public static void main(String[] args) {
        byte b = 5;
        short sh = 129;

        //b=a; bu sekılde yapamyız declare etmeylıyız
        b = (byte) sh; // bu şekilde
        System.out.println(b);
        //float ve int da küsüratı silerek bir veri kaybı olusturur.
        float fl = 2.6f;
        int i = 5;
        i = (int) fl;

        byte x = 10;
        byte y = 20;
        byte z = (byte) (x * y); // int dan kücük değerde işlem yaparken cast etmek gerekir çünkü sağ taraf her zaman int olur
        float ff=1.45f;
        float ff2=1.67f;
        int ff3 = (int) (ff*ff2);
        System.out.println(ff3);

    }
}
