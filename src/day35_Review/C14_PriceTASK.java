package day35_Review;

public class C14_PriceTASK {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        int count=0;
        for (double each:prices) {
            if (each>100.0){
                System.out.print("prices = " + each+" ");
            }
        if (each>50){
            count++;
        }

        }
        System.out.println("count = " + count);
    }
}
