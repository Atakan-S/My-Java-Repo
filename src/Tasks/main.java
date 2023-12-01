package Tasks;

public class main {
    public static void main(String[] args) {
        Square sqr= new Square(12);
        System.out.println("sqr.calculateArea() = " + sqr.calculateArea());
        System.out.println("sqr.calculatePerimeter() = " + sqr.calculatePerimeter());
        System.out.println("----------------------------------------------------------");
        Pencil pencil = new Pencil("mavi","15",true,"atakan salik.",false);
        System.out.println("pencil = " + pencil);
        Pencil pencil1 = new Pencil("mavi","15",true,"atakan salik.",true);
        System.out.println("pencil = " + pencil1);
        System.out.println("----------------------------------------------------------");
        Cat cat=new Cat("green","tekir",true,true);
        System.out.println("cat = " + cat);
        cat.food();
        cat.run();
        cat.sleep();
        System.out.println("----------------------------------------------------------");
        KraftBank kraftBank=new KraftBank(1,"Atakan salik",true);
        kraftBank.CustomerPassAdd();
        System.out.println("kraftBank = " + kraftBank);
        kraftBank.addMoney(1500);
        System.out.println("kraftBank = " + kraftBank);
        kraftBank.setSms(false);
        kraftBank.setCustomerFullName("harun kaya");
        System.out.println("kraftBank = " + kraftBank);
        kraftBank.setCustomerFullName("ahmet sezer");
        System.out.println("kraftBank = " + kraftBank);



    }
}
