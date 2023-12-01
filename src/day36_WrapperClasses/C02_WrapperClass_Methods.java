package day36_WrapperClasses;

public class C02_WrapperClass_Methods {
    public static void main(String[] args) {
        // valueOf() int ve String değer kabul eder -- çağırıldığı methoda göre değer döndürür
        String s = "123";
        // System.out.println(s*3); bunu kabul etmez
        Integer x = Integer.valueOf(s);// string değeri int a çevirdik
        int xx = Integer.valueOf(s);// auto unboxing
        System.out.println("x = " + x);
        System.out.println(x * 2);
        //----------------------------------------------
        //parseInt() string bir değer ve int döndürür primitive
        int i = Integer.parseInt(s);
        System.out.println("i = " + i);
        //----------------TASK-----------------------
        String str = "bugün hava 25 derece";
        // hava sıcaklığı 10 derece daha artarsa sıcaklık kaç derece olur
        String[] strArr = str.split(" ");
        int a = Integer.parseInt(strArr[2]) + 10;
        System.out.println("a = " + a);
        //---------------------------------------------
        String str2 = "bugün hava 20 derece; Bugün hava mevsim normallerinde";
        //40 derece ve üzerinde bir hava sıcaklığı varsa "bugün hava çok sıcak"
        // altında ise "bugün hava mevsim normallerinde"

    }
}
