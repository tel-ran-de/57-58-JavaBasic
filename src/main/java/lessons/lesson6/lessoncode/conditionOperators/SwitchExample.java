package lessons.lesson6.lessoncode.conditionOperators;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Hello, pick one...");
            System.out.println("add - Add product");
            System.out.println("edit - Edit product");
            System.out.println("delete - Delete product");
            System.out.println("exit - for exit =)");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "add":
                    System.out.println("Please fill product parameters...");
                    break;
                case "edit":
                    System.out.println("For edit, please specify product ID...");
                    break;
                case "delete":
                    System.out.println("Ok..");
                    break;
                case "exit":
                    isContinue = false;
                    break;
                default:
                    System.out.println("There is no such command...");
            }
        }
    }
}
