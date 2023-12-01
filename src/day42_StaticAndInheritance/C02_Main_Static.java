package day42_StaticAndInheritance;

public class C02_Main_Static {
    public static void main(String[] args) throws ClassNotFoundException {
      /*  C01_Mobile_Static obj = new C01_Mobile_Static();
        obj.brand="Apple";
        obj.price=2000;
        obj.name="SmartPhone";

        C01_Mobile_Static obj1 = new C01_Mobile_Static();
        obj1.brand="Samsung";
        obj1.price=1700;
        obj1.name="SmartPhone";

        C01_Mobile_Static.name="Phone";
        obj.show();
        obj1.show();

       */
        Class.forName("day42_StaticAndInheritance.C01_Mobile_Static");
        C01_Mobile_Static obj2 = new C01_Mobile_Static();
        C01_Mobile_Static obj3 = new C01_Mobile_Static();
        C01_Mobile_Static.show(obj2);

    }
}
