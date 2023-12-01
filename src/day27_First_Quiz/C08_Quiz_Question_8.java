package day27_First_Quiz;

public class C08_Quiz_Question_8 {
    public static void main(String[] args) {
        System.out.println("toplama(4) = " + toplama(4));
    }
    public static int toplama(int sayı){
       int result =0;
        for (int i = 0; i < sayı; i++) {
            result+=i;

        }
    return result;
    }
}
//-Kullanıcının girdiği sayısal bir ifadeyi alan ve 0 dan başlayarak girilen sayı dahil
       // toplamını veren metodu yazınız.