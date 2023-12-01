package Tasks;

public class Pencil {
    String color;
    String lenght;
    Boolean haveEraser;
    String write;
    boolean delete;

    public Pencil(String color, String lenght, Boolean haveEraser,String write,boolean delete) {
        this.color = color;
        this.lenght = lenght;
        this.haveEraser = haveEraser;
        this.delete = delete;
        if (delete){
            this.write=null;
        }else {
            this.write=write;
        }
    }





    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", lenght='" + lenght + '\'' +
                ", haveEraser=" + haveEraser +
                ", write='" + write + '\'' +
                ", delete=" + delete +
                '}';
    }
}
