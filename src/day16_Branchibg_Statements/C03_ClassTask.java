package day16_Branchibg_Statements;

public class C03_ClassTask {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%5!=0){

                continue;
            }
            System.out.println(i);
        }

    }
}
//  1 den 100 e kadar 5 in katlarını ekrana
//  yazdıran programı
//continue kullanarak yazınız