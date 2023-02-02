package lessons.lesson8;

import java.util.Scanner;

public class InputArray {

    public int[] userInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size of array - ");
        int size = scanner.nextInt();

        int[] createdArray = new int[size];

        for (int i = 0; i < createdArray.length; i++) {
            System.out.println("Please enter [ " + i + " ] element of array - ");
            createdArray[i] = scanner.nextInt();
        }

//        System.out.println(createdArray);
        return createdArray;
    }

    public int[] randomInput(int range){

        int size = (int) (Math.random()*range);
        int[] createdArray = new int[size];

        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int) (Math.random()*range*i);
        }

        return createdArray;
    }
}
