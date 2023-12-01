package day33_Array_03;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Task {
    public static void main(String[] args) {
        int[] intarr ={1,2,30,400,41,66};
        System.out.println("ArraySum(intarr) = " + ArraySum(intarr));
        System.out.println("Arrays.toString(returnStringArr()) = " + Arrays.toString(returnStringArr()));
    }
    public static int ArraySum(int arr[]){
      int sum=0;
        for (int i = 1; i < arr.length; i+=2) {
          sum+=arr[i];
        }
    return sum;
    }
    public static String[] returnStringArr(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Oluştrmak istediğiniz String array uzunluğu giriniz.");
    int lenght = scan.nextInt();
    scan.nextLine();
    String arry[]= new String[lenght];

        for (int i = 0; i < arry.length; i++) {
            System.out.println("Oluştrmak istediğiniz String array içeriğini giriniz.");
            String content=scan.nextLine();
            arry[i]=content;
        }
   return arry;
    }

}
