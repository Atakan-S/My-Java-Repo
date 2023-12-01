package day11_ControlFlowStatements;

public class C03_If_Examples {
    public static void main(String[] args) {
        Double fizik = 50.0;
        Double kimya = 60.0;
        Double ortalama = (fizik + kimya) / 2;
        System.out.println("ortalama = " + ortalama);
        if (ortalama > 50) {
            System.out.println("ALİ GEÇTİ.");
        } else {
            System.out.println("ALİ KALDI.");
            System.out.println("Öğretmen aliye çok çalış dedi.");
        }
        System.out.println("Program bitti.");
    }

}
/*
alinin fizik notu 50
kimya notu 30
ort 50 üzeri iseekrana geçti yazsın
 */