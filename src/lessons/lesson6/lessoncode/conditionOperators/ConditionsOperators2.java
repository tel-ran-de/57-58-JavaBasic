package lessons.lesson6.lessoncode.conditionOperators;

import java.util.Scanner;

public class ConditionsOperators2 {
    public static void main(String[] args) {

        int x ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 'x' value -");
        x = scanner.nextInt();


        if (x>0 && x<=100) {
            System.out.println("x = " + x +" and x is between 0 and 100" );
        } else if (x>100 && x<200){
            System.out.println("x = " + x +" and x is between 101 and 200");
        } else {
            System.out.println("x is out of range" );
        }


        if (x<0 || x> 200) {
            System.out.println("x = " + x +" and x lees then 0 or more then 200" );
        }

        if (x!=0) {
            System.out.println("x = " + x + " and x is not equal ZERO");

        }

        // ! x>0   ->  x<=0
        // ! x<0   ->  x>=0
        // ! x<=0  ->  x>0


        if (!(x>0)) {
            System.out.println("X>0");
        }


    }
}
