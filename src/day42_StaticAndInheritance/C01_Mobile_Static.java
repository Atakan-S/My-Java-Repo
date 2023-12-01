package day42_StaticAndInheritance;

import day43_Intheritance_AcsessModifiers.C03_Demo;

import java.security.ProtectionDomain;
import java.util.Scanner;

public class C01_Mobile_Static  {
   Scanner ob = new Scanner(System.in);
   protected String brand;
    int price;
   static String name;// bütün objeler için ortak hale geldi.

    public static void show(C01_Mobile_Static obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }

    public C01_Mobile_Static() {
        System.out.println("In Constructor");
    }

    public C01_Mobile_Static(Scanner ob, String brand, int price) {
        this.ob = ob;
        this.brand = brand;
        this.price = price;
    }

   static  {
        name="Phone";
        System.out.println("In Static block");
    }
}
