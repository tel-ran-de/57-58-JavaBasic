package lessons.lesson11;

public class PersonUtil {

    Person[] databasePerson = new Person[10];


    void addNewPerson(Person newPerson){

        for (int i = 0; i < databasePerson.length; i++) {
            if (databasePerson[i] == null) {
                databasePerson[i] = newPerson;
                break;
            }
        }
    }

    void printDB(Person[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println(workingArray[i]);
        }
    }

    Person createPerson (int id, String name, int age){
        return new Person(id,name,age);
    }

    Person[] chooseByAge(Person[] workingArray, int ageForChoosing){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i].age >= ageForChoosing) {
                counter++;
            }
        }

        Person[] arrayWithAgeControl = new Person[counter];

        counter =0;

        for (int i = 0; i < workingArray.length; i++) {
            if(workingArray[i].age >= ageForChoosing) {
                arrayWithAgeControl[counter] = workingArray[i];
                counter++;
            }
        }

        return arrayWithAgeControl;

    }

}
