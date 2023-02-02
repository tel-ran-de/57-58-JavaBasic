package lessons.lesson10.homework2;

public class RandomArrayApp2 {
    public static void main(String[] args) {


        ArrayUtil2 au = new ArrayUtil2();

        int arraySize = 5;

        int arrayRangeStart = 10;
        int arrayRangeEnd = 99;

        int[] workingArray = au.createArray(arraySize);
        au.fillArrayByRandomElements(workingArray, arrayRangeStart, arrayRangeEnd);

        au.printArray("Printing array with  data", workingArray);

        if (au.isArrayGrow(workingArray)) {
            System.out.println("Our array is growing!");
        } else {
            System.out.println("Our array is not growing!");
        }


    }
}
