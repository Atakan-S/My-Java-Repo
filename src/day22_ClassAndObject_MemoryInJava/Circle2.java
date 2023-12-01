package day22_ClassAndObject_MemoryInJava;

public class Circle2 {
        static int r;
        static double pI = Math.PI;
        public double alanHesapla(){
            return pI*Math.pow(r,2);
        }
        public double çevreHesapla(){
            return 2*pI*r;
        }
        public static double alanHesapla1(){return pI*Math.pow(r,2);}
        public static double çevreHesapla1(){return 2*pI*r;}
    }

