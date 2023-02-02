package lessons.lesson3;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input integer number ");
        int integerInput = input.nextInt();

        System.out.println(" Your number is " + integerInput);

        System.out.println("Input double number ");
        double doubleInput = input.nextDouble();

        System.out.println(" Your number is " + doubleInput);


        input.nextLine();


        System.out.println("Input text ");
        String  stringInput = input.nextLine();

        System.out.println(" Your text is " + stringInput);
    }
}
