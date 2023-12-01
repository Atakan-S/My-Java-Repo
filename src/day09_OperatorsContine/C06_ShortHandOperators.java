package day09_OperatorsContine;

public class C06_ShortHandOperators {
    public static void main(String[] args) {
        int number = 10; //decleration , assingment
        number = 20;
        System.out.println("number = " + number);

        String text = "java programing languange";
        System.out.println("text = " + text);

        text = "phyton programing languange";
        System.out.println("text = " + text);

        text = "golden globe";
        System.out.println("text = " + text);

        System.out.println("--------------------------------------");
        int x = 50;
        x = x + 1;//x++;
        System.out.println("x = " + x);
        x = x + 25;
        System.out.println("x = " + x);
        x += 25; // x=x+25;
        System.out.println("x = " + x);
        x = x - 25;
        System.out.println("x = " + x);
        x -= 25;// x=x-25;
        System.out.println("x = " + x);
        System.out.println("------------------------------");
        double bakiye = 1650.50;
        bakiye+=1555.0;
        System.out.println("bakiye = " + bakiye);


    }
}
