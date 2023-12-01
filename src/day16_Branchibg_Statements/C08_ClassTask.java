package day16_Branchibg_Statements;

import java.util.Scanner;

public class C08_ClassTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String şifre = "atakan";
        int hak =5;
        boolean flag =true;
        System.out.println("Toplam "+hak+" hakkınız var.");
while(flag){
    System.out.println("şifre = ");
    String tahmin = scan.next();
    if (tahmin.equalsIgnoreCase("atakan")){
        System.out.println("Tebrikler şifre doğru");
        break;
    }
    hak--;
    if (hak==0){
        System.out.println("hatalı tahmin hakınız doldu");
        break;
    }
    System.err.println("Yanlış parola lütfen tekrar deneyiniz kalan hak :"+hak);
}

        }
    }

//   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.