package day43_Intheritance_AcsessModifiers;

import day42_StaticAndInheritance.C01_Mobile_Static;

public class C03_Demo  {
    public static void main(String[] args) {
C02_Child ch = new C02_Child();
ch.childMethod(42);
        C01_Parent parent = new C01_Parent();
        System.out.println(parent.x);
        C01_Mobile_Static obj = new C01_Mobile_Static();

    }
}
