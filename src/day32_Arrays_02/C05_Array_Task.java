package day32_Arrays_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_Array_Task {
    public static void main(String[] args) {
        int arr[] = {2, 43, 34, 5};
        int arr1[] = {22, 432, 341, 51};
        System.out.println("arrayMethod(arr) = " + arrayMethod(arr));
        System.out.println("-----------------------------------------");
        System.out.println("arr içinde 5 var mı? = " + arrayMethod2(arr));
        System.out.println("-----------------------------------------");
        System.out.println("ilk eleman eşit mi (arr,arr1) = " + arrayMethod3(arr, arr1));
        System.out.println("-----------------------------------------");
        System.out.println("return arr,arr1 first digit = " + Arrays.toString(arrayMethod4(arr, arr1)));
        System.out.println("-----------------------------------------");
        System.out.println("Arrays.toString(arraySumÇarp(arr)) = " + Arrays.toString(arraySumÇarp(arr)));
        System.out.println("-----------------------------------------");
        System.out.println("Arrays.toString(arrayConcat(arr1,arr)) = " + Arrays.toString(arrayConcat(arr1, arr)));
    }

    /**
     * Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
     *
     * @param arr
     * @return
     */
    public static boolean arrayMethod(int[] arr) {
        if (arr.length > 5) {
            return true;
        }
        return false;
    }

    /**
     * Bir method yazın int array kabul etsin
     * array in içinde 5 olup olmadığını kontrol etsin.
     *
     * @param arr
     * @return
     */
    public static boolean arrayMethod2(int[] arr) {
        for (int x : arr) {
            if (x == 5) {
                return true;
            }
        }
        return false;
    }

    /**
     *  Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
     */
    public static boolean arrayMethod3(int[] arr, int[] arr1) {
        if (arr[0] == arr1[0]) {
            return true;
        }
        return false;
    }

    /**
     * 2 array kabul eden bir method yazın ve arraylerin
     * llk elemanları ile yeni bir array döndürsün.
     * @param arr
     * @param arr1
     * @return
     */
    public static int[] arrayMethod4(int[] arr, int[] arr1){
        int newArr []= new int[2];
         newArr[0]=arr[0];
         newArr[1]=arr1[0];

        return newArr;
    }
    public static int arraySum(int[] arr){
        int sum =0;
        for (int x:arr) {
            sum+=x;}
    return sum;
    }
    public static int[] arraySumÇarp(int[] arr){
        int sum =0;
        int çarpım =1;
        for (int x:arr) {
            sum+=x;
            çarpım*=x;
        }
    int newarray[]={sum,çarpım};
        return newarray;
    }
public static int[] arrayConcat(int[] arr1,int[] arr2){
        int[] newArray = new int[arr1.length+arr2.length];
    for (int i = 0; i < arr1.length; i++) {
newArray[i]=arr1[i];
    }
    for (int i = arr1.length; i < newArray.length; i++) {
        newArray[i]=arr1[i-arr1.length];
    }
    return newArray;
    }

}
// Verilen 2 arrayi birleştirip array döndüren bir method yazın.