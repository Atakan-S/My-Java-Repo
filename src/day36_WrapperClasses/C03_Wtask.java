package day36_WrapperClasses;

public class C03_Wtask {
    public static void main(String[] args) {
        String str ="ali'nin doğum yılı 1996";
        String birthYearStr = str.split(" ")[3];
        String name=str.split("'")[0];
        int birthyear = Integer.parseInt(birthYearStr);
        int year=2023;
    int age = year-birthyear+10;
        System.out.println(name+" "+age+" yaşında olur.");
    }
}
//"Ali'nin doğum yılı 1996" ise 10 yıl sonra ali kaç yaşında olur?
//Ali 37 yaşında olur.