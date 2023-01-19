package lessons.lesson6.lessoncode.conditionOperators;

import java.util.Scanner;

public class ConditionsOperators4 {
    public static void main(String[] args) {

      boolean isEven;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -");
        int x = scanner.nextInt();

        isEven = ( x % 2 ==0 );

        if (isEven) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }



    }
}
