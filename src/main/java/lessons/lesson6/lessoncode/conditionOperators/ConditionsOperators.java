package lessons.lesson6.lessoncode.conditionOperators;

import java.util.Scanner;

public class ConditionsOperators {
    public static void main(String[] args) {

        int x ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -");
        x = scanner.nextInt();


        if (x>0) {
            System.out.println("x = " + x +" and x > 0" );
        } else if (x<0){
            System.out.println("x = " + x +" and x < 0" );
        } else {
            System.out.println("x = 0!!!!" );
        }




    }
}
