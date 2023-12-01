package day10_Relational_Logicaloperations;

import java.util.Scanner;

public class C07_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pleas Enter findex score : ");
        int findexscore = scan.nextInt();

        boolean çokrısklı = findexscore >= 0 && findexscore <= 600;
        boolean ortarısklı = findexscore >= 700 && findexscore <= 1099;
        boolean azrısklı = findexscore >= 1100 && findexscore <= 1499;
        boolean iyi  = findexscore >= 1500 && findexscore <= 1699;
        boolean çokiyi = findexscore >= 1700 ;

        System.out.println("Çok Riskli Alamaz : "+çokrısklı);
        System.out.println("Orta Riskli Alma İhtimali Düşük : "+ortarısklı);
        System.out.println("Az Riskli Değişebilir : "+azrısklı);
        System.out.println("İyi Alabilir : "+iyi);
        System.out.println("Çok İyi Alabilir : "+çokiyi);





    }
}
