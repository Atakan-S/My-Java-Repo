package day30_Week06_Review;

public class C02_ArmstrongNum {
    public static void main(String[] args) {
        //System.out.println("isArmstrongNumber(153) = " + isArmstrongNumber(153));
        for (int i = 100; i <1000 ; i++) {
            if (isArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrongNumber(int num){
    int birlerbas = num%10;
    int onlarbas  = (num%100)/10;
    int yüzlerbas = num/100;
    int sum= (int) (Math.pow(birlerbas,3)+Math.pow(onlarbas,3)+Math.pow(yüzlerbas,3));
    if (sum==num){
       return true;
   }

   return false;
}
}
/*
            Task 4 :   Write a method that can check if a number is Armstrong number
                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
                print all the armstrong numbers with three digit
                Armstrong numbers are     === 153 370 371 407 === for 3 digits
                 153   ==  (111)+(555)+(333)
                             1       125      27  == 153
                153
                3     ---  153 % 10   ---  153 / 10 -->  15
                5     ---  15 % 10    ---  15 / 10  -->  1
                1     ---  1 % 10     ---   1 / 10  -->  0
               0 --> when we got this result , it means stop execution
            To see div / remainder operator
               153 % 3 -->    0
               153 / 3 -->    51
         */