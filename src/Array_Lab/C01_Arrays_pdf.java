package Array_Lab;

import java.util.Arrays;

public class C01_Arrays_pdf {
    public static void main(String[] args) {
        int[] array ={23,45,56,67,3};
        int[] array2 ={23,45,56,67,3};
        System.out.println(Arrays.toString(returnStringArray("merhaba java insanları bugün nasılsınız")));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(beştenAzOlanıArmutYap("kayısı, armut, üzüm, çilek, nar")));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(swapİndex("elma, armut, üzüm, çilek, nar")));
        System.out.println("-------------------------------------------------");
        System.out.println(indextoReturnOne("merhaba java insanları bugün nasılsınız"));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(sıralıSayıArray(5)));
        System.out.println("-------------------------------------------------");
        System.out.println(aritmatikOrt(array));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(enkucuksayıyıdoldur(array)));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(enkucuksayıyıdoldur2(array2)));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(twoArraytoString1("merhaba java insanları bugün nasılsınız")));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(twoArraytoString2("merhaba java insanları bugün nasılsınız")));
    }

    /**
     * «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
     * element olacak şekilde bir array a dönüştüren bir method yazın
     * @param str
     * @return
     */
    public static String[] returnStringArray(String str){
        String[] newArray=str.split(" ");
        return newArray;
    }

    /**
     * «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
     * element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
     * varsa onun yerine armut atayın
     * @param str
     * @return
     */
    public static String[] beştenAzOlanıArmutYap(String str){
        String[] newArray=str.split(",");
    String armut="armut";
    for (int i = 0; i < newArray.length; i++) {
        if (newArray[i].length()<6){
            newArray[i]=armut;
        }
    }

    return newArray;
    }

    /**
     * «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
     * element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın
     * @param str
     * @return
     */
    public static String[] swapİndex(String str){
        String[] newArray=str.split(",");
        String temp = newArray[0];
       newArray[0]=newArray[newArray.length-1];
        newArray[newArray.length-1]=temp;

        return newArray;
    }

    /**
     * «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
     * harflerinden bir döndüren method yazın.
     * @param str
     * @return
     */
    public static String indextoReturnOne(String str) {
        String[] splitSentence = str.split(" ");
        String[] splitSentence2 = str.split("");
        char[] splitWord = splitSentence[1].toCharArray();

        String newstr = null;
        for (char each : splitWord) {
            newstr = str.replace(each, '1');
        }

        return newstr;
    }

    /**
     * Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
     * biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]
     * @param n
     * @return
     */
    public static int[] sıralıSayıArray(int n) {
        int [] nArr= new int[n];

        for (int i = 0; i < n; i++) {
              nArr[i]=i;
        }


            Arrays.sort(nArr);

            return nArr;
    }

    /**
     * Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
     * veren bir method yazın.
     * @param array
     * @return
     */
    public static int aritmatikOrt(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return   array[0]+array[array.length-1]/2;
    }

    /**
     * Bir sayı dizisinin en küçük harfi ne ise sayı dizisini onunla dolduran bir
     * method yazın.
     * @param array
     * @return
     */
    public static int[] enkucuksayıyıdoldur(int[] array) {
        Arrays.sort(array);
        // for (int i = 0; i < array.length; i++) {
        //    array[i]=array[0];
        //}
        Arrays.fill(array,0,array.length,array[0]);
    return array;
    }

    /**
     * Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
     * onunla dolduran bir method yazın.
     * @param array
     * @return
     */
    public static int[] enkucuksayıyıdoldur2(int[] array) {
        Arrays.sort(array);
       // for (int i = array.length - 2; i >= 0; i--) {
         //   array[i]=array[0];
        //}
        Arrays.fill(array,0,array.length-1,array[0]);
        return array;

    }

    /**
     * «merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,insanları] ve [bugün, nasılsınız]
     * şeklinde 2 ayrı array a convert edin.
     * @param str
     * @return
     */
    public static String[] twoArraytoString1(String str){
        String[] arraySentence = str.split(" ");
        String[] arraySentence3word= Arrays.copyOfRange(arraySentence,0,3);
        String[] arraySentence2word= Arrays.copyOfRange(arraySentence,3,arraySentence.length);
    return arraySentence3word;

    }
    public static String[] twoArraytoString2(String str){
        String[] arraySentence = str.split(" ");
        String[] arraySentence3word= Arrays.copyOfRange(arraySentence,0,3);
        String[] arraySentence2word= Arrays.copyOfRange(arraySentence,3,arraySentence.length);
    return arraySentence2word;

    }
}
