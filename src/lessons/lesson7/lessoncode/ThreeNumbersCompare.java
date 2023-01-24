package lessons.lesson7.lessoncode;

import java.util.Scanner;

public class ThreeNumbersCompare {

    public double userInputNumbers (String message){
        double userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        userInput = scanner.nextDouble();
        return userInput;
    }

    public void printMsg(String message){
        System.out.println("--------");
        System.out.println(message);
    }

    public double compare(double parameter1, double parameter2, double parameter3 ){
        double compareResult = 0;

        if ((parameter1>=parameter2)&&(parameter1>=parameter3)) {
            compareResult = parameter1;
        } else  if ((parameter2>=parameter1)&&(parameter2>=parameter3)) {
            compareResult = parameter2;
        } else  {
            compareResult = parameter3;
        }

        return compareResult;
    }


}
