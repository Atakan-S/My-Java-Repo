package day36_WrapperClasses;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        int x=5;
      //  Integer y= new Integer(10);
     Integer y= 5;
     String str="Merhaba";
        System.out.println("y = " + y);
        System.out.println( y + x);
        System.out.println(y==x);// y wrappper classı diğer classlar gini  referans tutmaz tam tersı değeri içinde tutar o yuzden true gelir
        //----------------------------------------------------
        char c='e';
        Character cW='e';
        System.out.println("Character.isLetter('!') = " + Character.isLetter('!'));//F
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));//T
        System.out.println("Character.isDigit('A') = " + Character.isDigit('A'));//F
        System.out.println("Character.isDigit('2') = " + Character.isDigit('2'));//T
        System.out.println("Integer.max(50,89) = " + Integer.max(50, 89));//89
        //-------------------------------------------------------
        Integer sayiW=10;
        int sayiP=20;
        sayiP=sayiW.intValue();// unboxing
        sayiP=sayiW;// auto unboxing
        sayiW=sayiP;//auto boxing


    }
}
