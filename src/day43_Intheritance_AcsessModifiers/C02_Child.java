package day43_Intheritance_AcsessModifiers;

public class C02_Child extends C01_Parent {
    int x=98;
    public void childMethod(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

}
