package day16_Branchibg_Statements;

public class C04_SumOfEvenNumber {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <=20; i+=2) {
            sum+=i;

        }
        System.out.println("sum = " + sum);
    }
}
//0 ve 20 dahil aradaki çift sayıların
// toplamını ekrana yazdıran programı yazınız