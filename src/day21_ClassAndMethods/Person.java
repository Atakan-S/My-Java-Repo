package day21_ClassAndMethods;

public class Person {
    // fields yaş isim cinsiyet
    // aksiyon uyu(),oyunOyna()
    String name;
    String gender;
    int age;
    String tcNo;

    public void uyu(){
        System.out.println(name+" uyuyor");
    }
public void oyunOyna(){
    System.out.println(name+" Oyun oynuyor");
}
public String average(double d){
        if (d<50){
            return "C";
        }else if(d<75){
            return "B";
        }else{
            return "A";
        }
    }

}
