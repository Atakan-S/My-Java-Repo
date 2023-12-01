package day11_ControlFlowStatements;

public class C09_Ornek5 {
    public static void main(String[] args) {
        int sayı1 = 50;
        int sayı2 = 50;
        System.out.println("sayılar "+sayı1+" , "+sayı2);
        if (sayı1>sayı2){
            System.out.println("Büyük olan sayı " + sayı1);
        } else if (sayı1==sayı2) {
            System.out.println("Sayılar eşittir.");
        } else{
            System.out.println("Büyük olan sayı " + sayı2);
        }
    }
}
