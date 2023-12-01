package day19_MethodsReturnOverloading;

public class C05_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println(biggerNumber(5, 3));
    }
    public static int biggerNumber(int num1,int num2){
       return num1>num2 ? num1 : num2;
    }
}
