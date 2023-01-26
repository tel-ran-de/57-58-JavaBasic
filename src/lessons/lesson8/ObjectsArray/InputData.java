package lessons.lesson8.ObjectsArray;

import java.util.Scanner;

public class InputData {

    public String userInputText(String message){

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextLine();
    }

    public int userInputInt(String message){

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }

}
