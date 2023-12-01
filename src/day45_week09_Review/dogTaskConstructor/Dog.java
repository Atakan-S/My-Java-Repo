package day45_week09_Review.dogTaskConstructor;

public class Dog {

        public String name;
        public String bread;
        public int age;
        public String size;
        public String color;
       public static  boolean isFriendly;

        public Dog(String name, String bread, int age, String size, String color) {
            this.name = name;
            this.bread = bread;
            this.age = age;
            this.size = size;
            this.color = color;

        }

       public static  int numberOfLegs = 4;
        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", bread='" + bread + '\'' +
                    ", age=" + age +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


