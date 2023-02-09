package lessons.lesson12.gettersAndSetters;

public class PersonDataBase {
    private Person[] database = new Person[10];

    Person createPerson(){

        UserInput ui = new UserInput();

        int id = ui.integerInput("Please enter id ");
        String name = ui.stringInput("Please enter name");
        int age =  (int) (25+ Math.random()*(15));  //ui.integerInput("Please enter age ");
        String address = "Berlin";
        String occupation = "programmer " + (int) (Math.random()*25);
        String comment = "no comment";
        System.out.println("------------------------");
        return new Person(id,name,age,occupation,address,comment);

    }

    void fillDB(){
        System.out.println("Please enter personal data for new employer ");
        System.out.println("============================================");

        for (int i = 0; i < database.length; i++) {
            System.out.println("Person #" + (i+1));
            database[i] = createPerson();
        }

    }

    void printDB(){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int i = 0; i < database.length; i++) {
            System.out.println(database[i]);
        }
    }

}
