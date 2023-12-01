package day22_ClassAndObject_MemoryInJava;

public class Math2 {
    public static int pow(int num1,int num2){
        int taban=num1;
        int üst = num2;
        int result = 1;
        for (int i = 0; i < üst; i++) {

            result*=taban;
        }
        return result;
    }
}
