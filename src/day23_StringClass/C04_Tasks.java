package day23_StringClass;

import java.util.Scanner;

public class C04_Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String nameSurname = scan.nextLine();

        System.out.println("mesajın karakter sayısı = " + charNum(message));
        System.out.println("-----------------------------------");
        System.out.println("Adım ve soyadım kaç karakter  = " + charNum(nameSurname));
        System.out.println("-----------------------------------");
        System.out.println("Adım ve soyadım büyük harf ile  = " + upperCaseName(nameSurname));
        System.out.println("-----------------------------------");
        System.out.println("message.indexOf(args.length-1) = " + message.charAt(message.length()-1));
        System.out.println("-----------------------------------");
        messagePrint(message);
        System.out.println("-----------------------------------");


    }
public static int charNum(String message){
        return message.length();
}
public static String upperCaseName(String nameSurname){
   return nameSurname.toUpperCase();
    }
public static void messagePrint (String message){
    for (int i = 0; i < message.length(); i++) {
        System.out.println(message.charAt(i));
    }
}
}
