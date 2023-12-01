package day57_MapAndFinish;

import java.util.ArrayList;

public class Ogrenci {
    private  String isim;
    private  String soyisim;

    private int no;
    private ArrayList<String> dersler= new ArrayList<>();

    public Ogrenci(String isim, String soyisim, int no) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void Dersekle(String ders) {
        dersler.add(ders);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", no=" + no +
                '}';
    }
}
