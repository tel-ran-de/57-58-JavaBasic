package lessons.lesson11;

public class PersonDbDemo {
    public static void main(String[] args) {
        PersonUtil pu = new PersonUtil();

        pu.addNewPerson(pu.createPerson(1, "Petr",18));
        pu.addNewPerson(pu.createPerson(2, "Alex",19));
        pu.addNewPerson(pu.createPerson(3, "Ruslan",18));
        pu.addNewPerson(pu.createPerson(4, "Viktor",20));
        pu.addNewPerson(pu.createPerson(5, "Andrey",19));
        pu.addNewPerson(pu.createPerson(6, "Roman",17));
        pu.addNewPerson(pu.createPerson(7, "Olga",21));
        pu.addNewPerson(pu.createPerson(8, "Paven",20));
        pu.addNewPerson(pu.createPerson(9, "Timofey",19));
        pu.addNewPerson(pu.createPerson(10, "Mikhail",19));

        pu.printDB(pu.databasePerson);

        System.out.println("---------");
        Person[] arrayAgeControl = pu.chooseByAge(pu.databasePerson, 19);

        pu.printDB(arrayAgeControl);

    }
}
