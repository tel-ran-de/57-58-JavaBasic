package lessons.lesson11;

public class PersonDbDemo {
    public static void main(String[] args) {

        PersonUtil personUtilService = new PersonUtil();

        Person newPerson = personUtilService.createPerson(1, "Petr",18);

        personUtilService.addNewPerson(newPerson);

        newPerson = personUtilService.createPerson(2, "Alex",19);

        personUtilService.addNewPerson(newPerson);

        personUtilService.addNewPerson(personUtilService.createPerson(3, "Ruslan",18));
        personUtilService.addNewPerson(personUtilService.createPerson(4, "Viktor",20));
        personUtilService.addNewPerson(personUtilService.createPerson(5, "Andrey",19));
        personUtilService.addNewPerson(personUtilService.createPerson(6, "Roman",17));
        personUtilService.addNewPerson(personUtilService.createPerson(7, "Olga",21));
        personUtilService.addNewPerson(personUtilService.createPerson(8, "Paven",20));
        personUtilService.addNewPerson(personUtilService.createPerson(9, "Timofey",19));
        personUtilService.addNewPerson(personUtilService.createPerson(10, "Mikhail",19));

        personUtilService.printDB(personUtilService.databasePerson);

        System.out.println("---------");
        Person[] arrayAgeControl = personUtilService.chooseByAge(personUtilService.databasePerson, 19);

        personUtilService.printDB(arrayAgeControl);

    }
}
