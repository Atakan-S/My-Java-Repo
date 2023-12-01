package day16_Branchibg_Statements;

public class C10_Task {
    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
            if (i>30&&i<50){

                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
// 0 ile 100
// dahil 30-50 arasını yazdırmadan
// tüm sayıları ekrana yazın