package day19_MethodsReturnOverloading;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println("5! = " + faktoriyel(5));
    }
    public static long faktoriyel(int num){
        int faktoriyel =1;
        for (int i = 1; i <= num; i++) {
faktoriyel*=i;
        }
return faktoriyel;
    }
}
