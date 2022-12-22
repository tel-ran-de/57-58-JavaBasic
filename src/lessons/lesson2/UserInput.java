package lessons.lesson2;

import java.util.Scanner;

public class UserInput {

    public int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int inputInteger = scanner.nextInt();
        return inputInteger;
    }

    public double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }

    public String inputString(){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }


}
