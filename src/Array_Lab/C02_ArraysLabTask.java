package Array_Lab;

import java.util.Arrays;
import java.util.Random;

public class C02_ArraysLabTask {
    public static void main(String[] args) {
        int[] array1 = {23, 45, 56, 67, 3, 2, 5, 34};
        int[] array2 = {23, 45, 56, 67, 3, 2, 5, 56, 34};//9
        int[] array3 = {23, 45, 56, 78, 13, 14};//6
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        int[] array6 = {5,7,1,9};
        int[] arraydup = {2, 3, 3, 3, 6, 6, 5, 6, 3, 6, 6};
        System.out.println("ArrayOfsum=" + sumOfArray(array1));
        System.out.println("-----------------------------------");
        System.out.println("sumOfArrayEven = " + sumOfArrayEven(array1));
        System.out.println("-----------------------------------");
        System.out.println("sumOfArrayThree = " + sumOfArrayThree(array2));
        System.out.println("-----------------------------------");
        System.out.println("maxMinNumber(array1) = " + maxMinNumber(array1));
        System.out.println("-----------------------------------");
        System.out.println("(MinNumberArray(array1)) = " + Arrays.toString(MinNumberArray(array1)));
        System.out.println("-----------------------------------");
        System.out.println("Arrays.toString(createArray(8,15)) = " + Arrays.toString(createArray(8, 15)));
        System.out.println("-----------------------------------");
        System.out.println("Arrays.toString(createArray(array1,array2)) = " + Arrays.toString(createArray(array2, array3)));
        System.out.println("-----------------------------------");
        System.out.println("arrayControl(array1,array2) = " + arrayControl(array1, array2));
        System.out.println("-----------------------------------");
        System.out.println("Array’in içerisindeki sayıları ters çevir= " + Arrays.toString(reverseCreateArray(array4)));
        System.out.println("-----------------------------------");
        System.out.print("1-100 arası random 10 sayı = ");
        System.out.println("-----------------------------------");
        randomArray1_100();
        System.out.println("-----------------------------------");
        System.out.print("50-80 arası random 50 sayı = ");
        System.out.println("-----------------------------------");
        randomArray50_80();
        System.out.println("-----------------------------------");
        System.out.print("120-140 arası random 50 sayı = ");
        System.out.println("-----------------------------------");
        randomArray120_140();
        System.out.println("-----------------------------------");
        randomArray120_1402();
        System.out.println("-----------------------------------");
        System.out.println("arrayınİçinde3ArdardaVarmı(array4) = " + arrayınİçinde3ArdardaVarmı(array4));
        System.out.println("-----------------------------------");
        System.out.println(unıqueNumberFind(array5));
        System.out.println("-----------------------------------");
        System.out.println("ArrayOfDuplicateNumberReturn(arraydup) = " + ArrayOfDuplicateNumberReturn(arraydup));
        System.out.println("-----------------------------------");
        System.out.println("ArrayOfDuplicateNumberReturn(arraydup) = " + ArrayOfDuplicateNumberReturn(array4));
        System.out.println("-----------------------------------");
        System.out.println("İsThereİnArrayOfDuplicateNumber(arraydup) = " + İsThereİnArrayOfDuplicateNumber(array4));
        System.out.println("-----------------------------------");
        System.out.println("howManyOAreThere = " + HowManyOAreThere("Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu."));
        System.out.println("-----------------------------------");
        System.out.println("duplicateSentence(\"araba ile yola çıktık fakat araba arıza yaptı\") = " + duplicateSentence("araba ile yola çıktık fakat araba arıza yaptı"));
        System.out.println("-----------------------------------");
        System.out.println("duplicateSentence(\"araba ile yola çıktık fakat arıza yaptı\") = " + duplicateSentence("araba ile yola çıktık fakat arıza yaptı"));
        System.out.println("-----------------------------------");
        System.out.println("zeroAssignArray(array6) = " + Arrays.toString(zeroAssignArray(array6)));


    }

    /**
     * Örnek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.
     *
     * @param array
     * @return
     */
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int each : array) {
            sum += each;
        }
        return sum;
    }

    /**
     * Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız
     *
     * @param array
     * @return
     */
    public static int sumOfArrayEven(int[] array) {
        int sum = 0;
        for (int each : array) {
            if (each % 2 == 0) {
                sum += each;
            }
        }
        return sum;
    }

    /**
     * Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
     * [2,3,3,6,5,4,3] →9
     *
     * @param array
     * @return
     */
    public static int sumOfArrayThree(int[] array) {
        int sum = 0;
        for (int each : array) {
            if (each == 3) {
                sum += each;
            }
        }
        return sum;
    }

    /**
     * Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız. (Arrays.sort
     * kullanılmayacak)
     *
     * @param array
     * @return
     */
    public static String maxMinNumber(int[] array) {
        int max = 0;
        int min = 2147483647;
        for (int each : array) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        return max + " " + min;
    }

    /**
     * Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
     * Arrays.fill kullanılmayacak
     *
     * @param array
     * @return
     */
    public static int[] MinNumberArray(int[] array) {
        int min = 2147483647;
        for (int each : array) {
            if (each < min) {
                min = each;
            }

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = min;
        }
        return array;
    }

    /**
     * Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int[] createArray(int num1, int num2) {
        int[] array = new int[num2 - num1 + 1];
        for (int i = num1, j = 0; i <= num2; i++, j++) {
            array[j] = i;
        }
        return array;
    }

    /**
     * Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
     * oluşturan metodu yazınız.
     *
     * @param array1
     * @param array2
     * @return
     */
    public static int[] createArray(int[] array1, int[] array2) {
        //array1 lenght 9 array2 6
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = array1.length, j = 0; i < array2.length + array1.length; i++, j++) {
            newArray[i] = array2[j];
        }
        return newArray;
    }

    /**
     * Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
     * yer almıyorsa false yazdıran metodu yazınız.
     *
     * @param array1
     * @param array2
     * @return
     */
    public static boolean arrayControl(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int count = 0;
        for (int eachArr1 : array1) {
            for (int i = 0; i < array2.length; i++) {
                if (eachArr1 == array2[i]) {
                    count++;
                }
            }
        }
        if (count == array1.length) {
            return true;
        }
        return false;
    }

    /**
     * Örnek 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız
     *
     * @param array1
     * @return
     */
    public static int[] reverseCreateArray(int[] array1) {
        int newArray[] = new int[array1.length];
        for (int i = 0, j = array1.length - 1; i < array1.length; i++, j--) {
            newArray[i] = array1[j];
        }
        return newArray;
    }

    /**
     * Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
     * rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
     */
    public static void randomArray1_100() {
        Random random = new Random();
        int array1_100[] = new int[10];
        for (int i = 0; i < array1_100.length; i++) {
            int rndm = random.nextInt(100);
            array1_100[i] = rndm;
        }
        System.out.println(Arrays.toString(array1_100));
    }

    /**
     * Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
     * arasında rasgele sayılar atayın.
     */
    public static void randomArray50_80() {
        Random random = new Random();
        int array50_80[] = new int[50];
        for (int i = 0; i < array50_80.length; i++) {
            int rndm = random.nextInt(50, 80);
            array50_80[i] = rndm;
        }
        System.out.println(Arrays.toString(array50_80));
    }

    /**
     * Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
     * arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
     */
    public static void randomArray120_140() {
        Random random = new Random();
        int array120_140[] = new int[50];
        for (int i = 0; i < array120_140.length; i++) {
            int rndm = random.nextInt(120, 140);
            array120_140[i] = rndm;
        }
        System.out.println(Arrays.toString(array120_140));
        int count = 0;
        for (int each : array120_140) {
            if (each == 125) {
                count++;
            }
        }
        System.out.println("içerisinde " + count + " adet 125 sayısı bulunuyor.");
    }

    /**
     * Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
     * arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
     * (Array.sort kullanılmayacak)
     */
    public static void randomArray120_1402() {
        Random random = new Random();
        int array120_140[] = new int[50];
        for (int i = 0; i < array120_140.length; i++) {
            int rndm = random.nextInt(120, 140);
            array120_140[i] = rndm;
        }

        int max = 0;
        for (int each : array120_140) {
            if (each > max) {
                max = each;
            }
        }
        for (int i = 0; i < array120_140.length; i++) {
            if (array120_140[i] == max) {
                array120_140[i] = 121;
            }
        }
        int max2 = 0;
        for (int each : array120_140) {
            if (each > max2) {
                max2 = each;
            }
        }
        System.out.println("2. en büyük sayı = " + max2);
    }

    /**
     * Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız
     *
     * @param arr
     * @return
     */
    public static boolean arrayınİçinde3ArdardaVarmı(int[] arr) {
        for (int i = 0, j = 1, k = 2; i < arr.length; i++) {
            if (arr[i] == arr[j] - 1 && arr[i] == arr[k] - 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
     * yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
     *
     * @param arr
     * @return
     */
    public static String unıqueNumberFind(int[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[i]) {
                if (arr[i] != arr[i + 1]) {
                    result += arr[i] + ",";
                }
            }
            if (i > 0 && i != arr.length - 1) {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    result += arr[i] + ",";
                }
            }
            if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1]) {
                    result += arr[i] + ".";
                }
            }
        }
        return result;
    }

    /**
     * Örnek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
     * birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
     *
     * @param arr
     * @return
     */
    public static int ArrayOfDuplicateNumberReturn(int[] arr) {
        int minCont = 1;
        int sayı = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int check = arr[i];
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (check == arr[i1]) {
                    count++;

                }
            }
            if (count > minCont) {
                minCont = count;
                sayı = arr[i];
            }
            if (i == arr.length - 1) {
                return sayı;
            } else {
                return -1;
            }

        }

        return 0;
    }

    /**
     * Örnek 17:Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
     *
     * @param array
     * @return
     */
    public static boolean İsThereİnArrayOfDuplicateNumber(int[] array) {
        int i = 0;
        int count = 0;
        for (int a : array) {
            if (i <= array.length - 1) {
                if (a == array[i]) {
                    count++;
                    i++;

                }
                i++;
                if (count > 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
     * dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
     * sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
     * üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
     * harfi vardır. (Büyük ve küçük ihmal edilecek)
     *
     * @param str
     * @return
     */
    public static int HowManyOAreThere(String str) {
        int count = 0;
        String strArr[] = str.split("");
        for (String s : strArr) {
            if (s.equalsIgnoreCase("o")) {
                count++;
            }
        }
        return count;
    }

    /**
     * Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
     * yazınız.
     * @param str
     * @return
     */
    public static boolean duplicateSentence(String str) {
        String strArray[] = str.split(" ");

        for (int i = 0, k = i + 1; i < strArray.length; i++, k++) {
            k = i + 1;
            for (int j = 0; j < strArray.length; j++, k++) {
                if (k < strArray.length) {
                    if (strArray[i].equals(strArray[k])) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    /**
     * Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
     * indekslere 0 atayan metodu yazınız.
     * @param array
     * @return
     */
    public static int[] zeroAssignArray(int[] array){
        int min = 278999999;
        for (int i : array) {
            if (i<min){
                min=i;
            }
        }
    int newArray[]=new int[array.length];
        newArray[0]=min;
        for (int i = 1; i < newArray.length-1; i++) {
            newArray[i]=0;
        }
    return newArray;
    }

}








