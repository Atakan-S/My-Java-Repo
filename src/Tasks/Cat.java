package Tasks;

public class Cat {
    String eyeColor;
    String breed;
    boolean isFat;
    boolean isPet;

    public Cat(String eyeColor, String breed, boolean isFat, boolean isPet) {
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.isFat = isFat;
        this.isPet = isPet;
    }

    public void sleep(){
        System.out.println("Cat is sleeping.");
    }
public void food(){
    System.out.println("Cat is eating");
}
public void run(){
    System.out.println("Cat is running.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyeColor='" + eyeColor + '\'' +
                ", breed='" + breed + '\'' +
                ", isFat=" + isFat +
                ", isPet=" + isPet +
                '}';
    }
}
