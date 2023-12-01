package day57_MapAndFinish;

import java.util.HashMap;
import java.util.Map;

public class C05_MapExample2 {
    public static void main(String[] args) {
        Map<String,String> rabiakartvizit=new HashMap<>();
        rabiakartvizit.put("isim","Rabia çalık");
        rabiakartvizit.put("email","rabia@gmail.com");
        rabiakartvizit.put("adress","Ankara/Türkiye");
        rabiakartvizit.put("telefon","0555123456");
        Map<String,String> rabiakartvizit2=new HashMap<>();
        rabiakartvizit.put("isim","Rabia çalık");
        rabiakartvizit.put("email","rabia@gmail.com");
        rabiakartvizit.put("adress","Ankara/Türkiye");
        rabiakartvizit.put("telefon","0555123456");

        System.out.println("rabiakartvizit.get(\"adress\") = " + rabiakartvizit.get("adress"));
        System.out.println("rabiakartvizit.get(\"email\") = " + rabiakartvizit.get("email"));

        Map<String,Map<String,String>> kartvizitler=new HashMap<>();
        kartvizitler.put("rabia",rabiakartvizit);
        kartvizitler.put("rabia2",rabiakartvizit2);
        System.out.println("kartvizitler.get(\"Rabia\") = " + kartvizitler.get("rabia"));
        System.out.println("kartvizitler.get(\"rabia\").get(\"email\") = " + kartvizitler.get("rabia").get("email"));

    }
}
