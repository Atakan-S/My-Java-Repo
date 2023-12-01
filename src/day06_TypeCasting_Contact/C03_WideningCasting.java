package day06_TypeCasting_Contact;

public class C03_WideningCasting {
    public static void main(String [] args){
        byte b=5;
        short sh=45;
        sh=b; //byte değeri short içine attık java otomatik olarak değeri dönüştürdü.
        System.out.println(sh);
        int i=14;
        i=sh; // bu yapılan işleme widening casting denir (genişletme)
        long l=234234234;
        l=i;
        System.out.println(l);
    }
}
