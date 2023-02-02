package lessons.lesson10.homework;

import java.util.Scanner;

public class UserInterface {

    public int userIntInput(String requestMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(requestMessage);
        return scanner.nextInt();
    }

}
