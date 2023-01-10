package lessons.lesson2;

public class DogDemo {
    public static void main(String[] args) {

        int x = 0;

        Dog myFirstDog = new Dog();

        myFirstDog.name = "Tuzik";
        myFirstDog.age = 1;
        myFirstDog.breed = "Taksa";

        Dog mySecondDog = new Dog("Bobik");


        System.out.println( "My first dog name " + myFirstDog.name);
        System.out.println( "My first dog age " + myFirstDog.age);
        System.out.println( "My first dog breed " + myFirstDog.breed);

        System.out.println( "My second dog name " + mySecondDog.name);

        System.out.println("--------");

        Dog myMainDog = new Dog("Tarzan", 3, "kolly",true);


        System.out.println( "My main dog name " + myMainDog.name);
        System.out.println( "My main dog age " + myMainDog.age);
        System.out.println( "My main dog breed " + myMainDog.breed);
        System.out.println( "Is dog long ? - " + myMainDog.shortOrLong);

        myMainDog.age= myMainDog.age+1;
        myMainDog.name = " Barbos ";

        System.out.println( "My main dog name " + myMainDog.name);


        System.out.println( "My main dog age " + myMainDog.age);




    }
}
