package day21_ClassAndMethods;

public class C03_Fibonacci {
    public static void main(String[] args) {
        fibonacci(12);
    }

    private static void fibonacci(int n) {
   int x=0;
   int y=1;
   int z;
        System.out.println(x+" ");
        System.out.println(y+" ");
        for (int i = 0; i < n-2; i++) {
            z=x+y;
            System.out.println(z+" ");
            x=y;
            y=z;
        }

    }
}
