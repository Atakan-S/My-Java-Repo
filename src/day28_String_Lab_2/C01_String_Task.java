package day28_String_Lab_2;

public class C01_String_Task {
    /*
        Kullanıcıdan bir kelime alın ve kin kelimesi başından veya
        ilk karakterden sonra gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
        Kinlenmek true
        Kin tutmak true
        Ekin ektim true
        Keskin ilçesinden geçiyorum false
         Neden kin tutuyorsun false */
    public static boolean kelimeKontrol(String str, String control) {
        if (str.startsWith(control)) {
            return true;
        } else if (str.substring(1).startsWith(control)) {
            return true;
        } else return false;
    }

    public static boolean kelimeKontrol2(String str, String control) {
        str = str.toLowerCase();
        control = control.toLowerCase();
        return str.startsWith(control) || str.substring(1).startsWith(control);
    }

    public static boolean kelimeKontrol3(String str, String control) {
        str = str.toLowerCase();
        control = control.toLowerCase();
        return str.substring(0, control.length() + 1).contains(control);
    }

    /**
     * İnput: "Harun Özsoy "
     * //Output: "Soy isminiz Özsoy dır."
     * //İnput:" Harun Kenan Özsoy " Output: "Soy isminiz Özsoy"
     * //İnput: "Harun Kenan Can Özsoy " Output: "Soy isminiz Özsoy"
     * //İnput:" Harun Kenan Can Sami Özsoy" Output: "Soy isminiz Özsoy"
     * //Kullanıcı başına ve sonuna dilediği kadar boşluk girebilir lütfen
     * // bu durumu dikkate alın. Output’u dikkatli inceleyin.
     **/
    public static String soyadıDöndür(String str) {
        str = str.trim();
        return str.substring((str.lastIndexOf(" ") + 1));
    }

    //Kullanıcıdan bir dize sözcük alın ve yinelenen
// her karakteri kelimenizden çıkartarak sonuç
// döndüren metodu yazınız. (Büyük küçük duyarlı)
// Merhaba Merhab Ananas Anas
    public static String dizeDöndür(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);

            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("kelimeKontrol(\"kinlenmek\",\"kin\") = " + kelimeKontrol("kinlenmek", "kin"));
        System.out.println("soyadıDöndür(\"atakan ahrun kamil tarık özsoy\") = " + soyadıDöndür("atakan ahrun kamil tarık özsoy"));
    }
}


//Kullanıcının  ad ve soyad bilgilerini
//  Ekrana "Soy isminiz ..(soyad)" Yazan metodu yazınız.

