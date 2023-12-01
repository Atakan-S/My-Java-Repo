package day44_Rewiev.Car;

import day46_FinalAndHiding.A;

public class MyGarage {
    public static void main(String[] args) {


        Honda honda = new Honda("Accord", "Black", 2010, 57000);
    honda.start();
        honda.stop();
        Audi audi = new Audi("RS6","RED",2023,20000000.5);
        System.out.println("audi = " + audi);
        audi.start();
        audi.stop();
        Togg togg   = new Togg();
        System.out.println(togg);
        togg.setColor("Toros siyahı");
        togg.setPrice(-1231231);

    }
}
