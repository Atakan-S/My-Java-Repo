package day31_Arrays_01;

public class C02_Array_1 {
    public static void main(String[] args) {
        int[] x = new int[5];
        int y[];
        y = new int[5];
        x[0] = 105;
        x[3] = 54;
        System.out.println("x[0] = " + x[0]);
        System.out.println("x[3] = " + x[3]);

        String[] str = new String[4];
        str[0] = "hatice";
        str[1] = "atakan";
        str[2] = "burcu";
        System.out.println("str[0] = " + str[0]);
        System.out.println("str[1] = " + str[3]);
        int[] arr1 = new int[5];//yontem 1
        arr1 = new int[5];//yontem 2
        arr1[0]=0;
        arr1[1]=12;
        arr1[2]=32;
        arr1[3]=45;
        arr1[4]=66;


        int[] arr2 = {0,12, 32, 45, 66};//yontem 3 en basıt hali.
        System.out.println("arr2[0] = " + arr2[0]);
        System.out.println("arr2[4] = " + arr2[4]);
    }
}
