package day39_ConstructorOverloading;

public class Rectangle {
    public double lenght,witdh;
    public Rectangle(double lenght,double witdh){
        this.lenght=lenght;
        this.witdh=witdh;
    }
public double calculateArea(){
        return lenght*witdh;
}
    public double calculatePerimeter(){
        return (lenght+witdh)*2;

    }
public String toString(){
        return "Rectangle{"+
                "lenght='"+lenght+"'"+
                ", witdh='"+witdh+"'"+
                ", area= '"+calculateArea()+"'"+
                ", perimeter= '"+calculatePerimeter()+"'";
}
}
/*
create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle passed
          in the print statement
 */