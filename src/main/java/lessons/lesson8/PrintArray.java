package lessons.lesson8;

import java.util.Arrays;

public class PrintArray {
    public void arrayPrint(String message, int[] workingArray){
        System.out.println("-----/////------");
//        System.out.println(workingArray);
        System.out.println(message);
        System.out.println(Arrays.toString(workingArray));
    }
}
