package lessons.lesson12.arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] integerArray = new int[10];

        String[] stringArray = new String[5];

        Cat[] cats = new Cat[3];

        Dog[] dogs = new Dog[4];

        Student[] students = new Student[15];

        cats[0] = new Cat("Barsik" , "grey");
        cats[1] = new Cat("Murzik" , "black");
        cats[2] = new Cat("Lucky" , "red");

        String searchColor = "black";

        for (int i = 0; i < cats.length; i++) {

            if (searchColor.equals(cats[i].color)){
                System.out.println("cat with color " + searchColor + " is " + cats[i]);
            }

        }




    }
}
