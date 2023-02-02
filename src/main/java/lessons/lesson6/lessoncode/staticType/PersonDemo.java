package lessons.lesson6.lessoncode.staticType;

public class PersonDemo {
    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga = new Person();

        personPetr.name = "Petr";
        personPetr.town = "Dnepropetrovsk";


        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


        personOlga.name = "Olga";
        personOlga.town = "Kiev";


        System.out.println("======== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

    }
}
