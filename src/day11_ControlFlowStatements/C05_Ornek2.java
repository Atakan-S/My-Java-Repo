package day11_ControlFlowStatements;

public class C05_Ornek2 {
    public static void main(String[] args) {
        int havasıcaklıgı = 12;
        System.out.println("Hava sıcaklığı : "+havasıcaklıgı);
        if (havasıcaklıgı>20){
            System.out.println("HAVA SICAK");
        }
    else {
            System.out.println("HAVA SOĞUK");
        }
        System.out.println("Program bitti");
    }
}
