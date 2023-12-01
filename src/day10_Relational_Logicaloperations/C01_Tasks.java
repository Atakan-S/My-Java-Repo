package day10_Relational_Logicaloperations;

public class C01_Tasks {
    public static void main(String[] args) {
        int i=10;
        int j =0;
        j= --i + ++i + --i + i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
        j = i++ + i-- * -i++ *--i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
        j = i++ -i++ / --i * i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);



    }
}
