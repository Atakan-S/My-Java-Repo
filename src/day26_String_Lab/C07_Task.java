package day26_String_Lab;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {
        //System.out.println(usernamePassword());
        System.out.println(twoString());
    }

    public static String usernamePassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---KULLANICI ADI---");
        String username = scan.nextLine();
        System.out.println("---ŞİFRE---");
        String password = scan.nextLine();

        if (username.isEmpty() & password.isEmpty()) {
            String msg = "Password ve username alanı boş olamaz.";
            return msg;
        } else if (password.isEmpty()) {
            String msg = "Password alanı boş olamaz.";
            return msg;
        } else if (password.length() < 8) {
            String msg = "Password 8 karakterden az olamaz.";
            return msg;
        } else if (username.length() < 3) {
            String msg = "username 8 karakterden az olamaz.";
            return msg;
        }

        return "giriş başarıyla yapıldı";
    }

    public static String twoString() {
        Scanner scan = new Scanner(System.in);
        out:while (true) {
        System.out.println("---string1---");
        String string1 = scan.nextLine();
        System.out.println("---string2---");
        String string2 = scan.nextLine();

            if (string1.length() != string2.length()&&string1!=string2) {
                System.out.println("Kelimeler her anlamda farklı");
            } else if (string1.equalsIgnoreCase(string2)) {
                return "kelimeler aynı";
            } else if (string1.length() == string2.length()) {
                return "girdiğiniz kelimelerin karekter sayısı eşit ";
            }
        }
    }

}

