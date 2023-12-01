package day22_ClassAndObject_MemoryInJava;

import day21_ClassAndMethods.Car;

public class JavaMermory {

    public static int variables(int x , int y){
        for (int i = 0; i < 5; i++) {
            int a =(i+5);
            System.out.println("a = " + a);
        }
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        
    }
}
