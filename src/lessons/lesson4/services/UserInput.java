package lessons.lesson4.services;

import java.util.Scanner;

public class UserInput {

    public String stringInput(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        String userInputString = scanner.nextLine();

        return userInputString;

    }
    public int integerInput(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        int userInputInteger = scanner.nextInt();

        return userInputInteger;

    }

    public boolean booleanInput(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        boolean userInputBoolean = scanner.nextBoolean();

        return userInputBoolean;

    }
}
