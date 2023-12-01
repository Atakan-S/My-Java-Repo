package day11_ControlFlowStatements;

public class C11_Task {
    public static void main(String[] args) {
        int ayşeninparası = 2;
        System.out.println("Ayşenin şu anki parası : "+ayşeninparası);
        if (ayşeninparası<5){
            ayşeninparası+=10;
            System.out.println("babası ona 10 tl verdi");
            System.out.println("ayşenin parası : "+ayşeninparası);

        } else if (ayşeninparası>50) {
            ayşeninparası-=20;
            System.out.println("babası ondan 20 tl aldı");
            System.out.println("ayşenin parası : "+ayşeninparası);
        }else {
            System.out.println("ayşenin parası : "+ayşeninparası);

        }

    }
}
/*
        ayşenin cep harçlığı 5 liradan az ise babası ona 10 tl daha versin
        50 liradan fazla ise babası 20 tl sini alsın
        aksi durumda babası para vermesin ama almasın da
         */