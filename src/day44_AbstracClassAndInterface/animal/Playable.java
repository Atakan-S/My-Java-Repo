package day44_AbstracClassAndInterface.animal;

public interface Playable {
    boolean isFriendly = true;// static & final olur otoamtıkmen çünkü interface içinde

    public static void method1(){
        System.out.println("isFriendly = " + isFriendly);
    }
    void play();//abstract method

}
