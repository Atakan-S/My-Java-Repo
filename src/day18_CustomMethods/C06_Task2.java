package day18_CustomMethods;

public class C06_Task2 {
    public static void main(String[] args) {
        calculatePrintNumbers(5,6);
        System.out.println("--------------------------");
        calculatePrintNumbers2(10,20,"*");
        System.out.println("--------------------------");
        System.out.println(asalsayı(2));
        System.out.println("--------------------------");
        System.out.println(pozitiveOrNegative(-2));
        System.out.println("--------------------------");
        System.out.println(numTrueOrFalse(25,35));
        System.out.println("--------------------------");
    }
    /**
     * 2 sayı alır ve matematiksel görünümünü verir
     *
     * @param num1
     * @param num2
     */
    public static void calculatePrintNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    /**
     * 2 sayı alır belirtilen işlemi yapar ve sonucu yazdırır.
     *
     * @param num1
     * @param num2
     * @param process
     */
    public static void calculatePrintNumbers2(int num1, int num2, String process) {
        if (process.equalsIgnoreCase("+")) {
            int result = num1 + num2;
            System.out.println(num1 + " " + process + " " + num2 + " = " + result);
        } else if (process.equalsIgnoreCase("-")) {
            int result = num1 - num2;
            System.out.println(num1 + " " + process + " " + num2 + " = " + result);
        } else if (process.equalsIgnoreCase("*")) {
            int result = num1 * num2;
            System.out.println(num1 + " " + process + " " + num2 + " = " + result);
        } else if (process.equalsIgnoreCase("/")) {
            int result = num1 / num2;
            System.out.println(num1 + " " + process + " " + num2 + " = " + result);
        } else {
            System.err.println("process hatalı karakter !");
        }
    }

    /**
     * bir sayı alır asal olup olmadığını yazdırır.
     * @param num1
     * @return
     */
    public static boolean asalsayı(int num1) {
        if (num1 % 2 == 0 && num1 != 2) {
            return false;
        } else
            return true;
    }

    /**
     * bir sayı alır pozitif yada negatif olmadğını yazdırır.
     * @param num
     * @return
     */
    public static int pozitiveOrNegative(int num) {
        if (num < 0) {
            int result = num * -1;
            return result;
        } else if (num > 0) {
            int result = num * -1;
            return result;
        } else {
            System.out.println("ZERO");
            return num;
        }
    }

    /**
     * 2 sayı alır son rakamı aynı ise true farklı ise false alır.
     * @param num1
     * @param num2
     * @return
     */
    public static boolean numTrueOrFalse(int num1,int num2){
if (num1%10==num2%10){
    return true;
}else {
    return false;
}


    }
}
