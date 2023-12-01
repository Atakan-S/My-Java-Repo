package day33_Array_03;

import java.util.Arrays;
import java.util.Scanner;


public class C02_Tasks {
    public static void main(String[] args) {
        int[] intarr ={1,2,30,-400,41,66};
        System.out.println("maxOfArray(intarr) = " + maxOfArray(intarr));
        System.out.println("minOfArray(intarr) = " + minOfArray(intarr));
        System.out.println("Arrays.toString(reverseArray(intarr)) = " + Arrays.toString(reverseArray(intarr)));

    }
//    int array in en büyük elemanını döndüren bir method yazın
    public static int maxOfArray(int[] arr){
   Arrays.stream(arr).max();
int max=arr[0];
        for (int i : arr) {
            if (i>max){
                max=i;
            }
        }

        return max;
    }
    //    int array in en kucuk elemanını döndüren bir method yazın
    public static int minOfArray(int[] arr){
        int min =arr[0];
        for (int i : arr) {
            if (i< min){
                min =i;
            }
        }

        return min;
    }
    //    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın
    public static int[] swapOfArray(int[] arr){
        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }
    //    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] reverseArray(int[] arr ){
       int temparr[]=new int[arr.length];
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            temparr[i]=arr[j];
        }

    return temparr;

    }
    public static int sumOfOddIndex(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=arr[i];
        }
        return sum;
    }

//Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
//bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun.

    public static String[] createStringArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen String Arrayin uzunlugunu giriniz: ");

        int length =scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[length];

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("String Arrayin "+(i+1)+" . elemanini giriniz" );
            strArr[i]=scanner.nextLine();
        }
        return strArr;
    }


}
