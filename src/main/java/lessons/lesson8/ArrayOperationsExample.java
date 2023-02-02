package lessons.lesson8;

import java.util.Arrays;

public class ArrayOperationsExample {

    public int sumOfArrayElements (int[] workingArray){
        int sum =0;
        for (int i = 0; i < workingArray.length; i++) {
            sum = sum + workingArray[i];
        }

        return sum;
    }

    public int minOfArrayElements(int[] workingArray){
        int min = workingArray[0];

        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] < min)  {
                min = workingArray[i];
            }
        }
        return min;
    }

    public int maxOfArrayElements(int[] workingArray){
        int max = workingArray[0];

        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] > max)  {
                max = workingArray[i];
            }
        }
        return max;
    }

    public void checkEvenElements(int[] workingArray){

        int[] newArray = workingArray.clone();

        for (int i = 0; i < newArray.length; i++) {
            if (i % 2 == 0) {
                newArray[i] = 0;
            }
        }
        System.out.println("New array - " + Arrays.toString(newArray));
    }

}
