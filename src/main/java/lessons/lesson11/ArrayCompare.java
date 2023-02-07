package lessons.lesson11;

public class ArrayCompare {
    public static void main(String[] args) {
        String[] stringArray = {"Ivan", "Ruslan", "Petr", "Alex", "Viktor", "Pavel","Andrey","Alex"};
        String variableForCompare = "Alex";


        boolean isContains = false;
        int counter = 0;

        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].equals(variableForCompare)) {
                isContains = true;
                counter = i;

            }
        }

        if (isContains) {
            System.out.println("Name " + variableForCompare + " is present in our array on index " + counter);
        } else {
            System.out.println("Name " + variableForCompare + " is not present in our array.");
        }


    }
}
