package lessons.lesson12.gettersAndSetters;

import java.util.Arrays;

public class PersonDBDemo {
    public static void main(String[] args) {

        Person[] database = new Person[10];

        database[0] = new Person(1,"Petr",25,"programmer","Berlin", "good java developer");

        System.out.println(database);
        System.out.println(Arrays.toString(database));

        extracted(database[0]);

        database[0].setAddress("Leipzig");

        extracted(database[0]);


        database[1] = new Person(2, "Ruslan", 31);
        extracted(database[1]);

        database[1].setOccupation("java developer");
        database[1].setAddress("Munich");
        database[1].setComment("new member");
        extracted(database[1]);

        System.out.println(Arrays.toString(database));

        database[0] = database[1];

        System.out.println(Arrays.toString(database));

    }

    private static void extracted(Person person) {
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getOccupation());
        System.out.println(person.getAddress());
        System.out.println(person.getComment());
    }
}
