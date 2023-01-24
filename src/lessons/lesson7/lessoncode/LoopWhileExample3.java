package lessons.lesson7.lessoncode;

import java.util.Scanner;

public class LoopWhileExample3 {
    public static void main(String[] args) {

        boolean condition = true;
        int summ = 0;

        while (condition) {

            menuPrint("Please enter your number (0 - exit)");
            int userInput = userInput();

            summ = summ + userInput;

            if (userInput == 0) {condition = false;}

        }

        menuPrint("Finish loop while");
        menuPrint("Total summ = " + summ);


    }
    public static void menuPrint(String message){
        System.out.println(message);

    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
