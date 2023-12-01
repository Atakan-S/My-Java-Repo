package day23_StringClass;

public class C03_StringMehods {
    public static void main(String[] args) {
        String programıngLanguange = "java";// strng pool içinde bir obje oluşturur
        System.out.println("programıngLanguange.length() = " + programıngLanguange.length());
        programıngLanguange="phyton";// strng pool içinde yeni bir obje oluşturur "java" yı silmez.
        System.out.println("programıngLanguange.length() = " + programıngLanguange.length());
        System.out.println("---------------------------------------");
        // toLowerCase , toUpperCase
        System.out.println("programıngLanguange.toUpperCase() = " + programıngLanguange.toUpperCase());
        System.out.println("programıngLanguange.toUpperCase() = " + programıngLanguange.toLowerCase());
        programıngLanguange= programıngLanguange.toUpperCase();
        System.out.println("programıngLanguange = " + programıngLanguange);
        System.out.println("---------------------------------------");
        //charAt() programıngLanguange=PHYTON
        //                        012345
        System.out.println("---------------------------------------");
        System.out.println(programıngLanguange.charAt(2));//Y
        System.out.println(programıngLanguange.charAt(programıngLanguange.length() - 1));
        System.out.println("---------------------------------------");
        System.out.println(programıngLanguange.concat(" atakan"));
        System.out.println("---------------------------------------");
        System.out.println(programıngLanguange);
        System.out.println("programıngLanguange.contains(\"PH\") = " + programıngLanguange.contains("PH"));
        // "CONTAİNS" içinde var mı diye kontrol eder
        programıngLanguange = "Java Programming Languange";
        System.out.println("programıngLanguange.contains(\"java\") = " + programıngLanguange.contains("java"));
        System.out.println("---------------------------------------");
        System.out.println("programıngLanguange.trim() = " + programıngLanguange.trim());
        System.out.println("---------------------------------------");
        System.out.println("programıngLanguange.replace(\"Java\",\"Phyton\") = " + programıngLanguange.replace("Java", "Phyton"));
        System.out.println("---------------------------------------");
        programıngLanguange=programıngLanguange.replace(" ", "");
        System.out.println("programıngLanguange.indexOf(\"Java\") = " + programıngLanguange.indexOf("Java"));// başaldığı karakterin sayısını verir
        System.out.println("programıngLanguange = " + programıngLanguange);


    }
}
