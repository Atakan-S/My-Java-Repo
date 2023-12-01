package day23_StringClass;

import java.util.Scanner;

public class C05_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 adet mesaj girin");
        String message1 = scan.nextLine();
        String message2 = scan.nextLine();
        String message3 = scan.nextLine();
        System.out.println("msgLength(message1) = " + msgLength(message1));
        System.out.println("msgLength(message2) = " + msgLength(message2));
        System.out.println("msgLength(message3) = " + msgLength(message3));
        concatMsg(message1,message2,message3);

    }
public static int msgLength(String msg){
        return msg.length();
}
public static void concatMsg(String message1,String message2,String message3){
    if (msgLength(message1)>msgLength(message2) && msgLength(message1)>msgLength(message3)){
        if (msgLength(message2)>msgLength(message3)){
            System.out.println(message1.concat(message2).concat(message3));
        }else
            System.out.println(message1.concat(message3).concat(message2));
    }else if (msgLength(message2)>msgLength(message1) && msgLength(message2)>msgLength(message3)){
        if (msgLength(message1)>msgLength(message3)){
            System.out.println(message2.concat(message1).concat(message3));
        }else
            System.out.println(message2.concat(message3).concat(message1));
    }else if (msgLength(message3)>msgLength(message2) && msgLength(message3)>msgLength(message1)){
        if (msgLength(message2)>msgLength(message1)){
            System.out.println(message3.concat(message2).concat(message1));
        }else
            System.out.println(message3.concat(message1).concat(message2));
    }else
        System.out.println(message1.concat(message2).concat(message3));
}
}
