package lessons.lesson8;

public class ArrayExample {
    public static void main(String[] args) {

        InputArray inputArray = new InputArray();
        PrintArray printArray = new PrintArray();
        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

        //System.out.println(inputArray);

        //int[] workArray = inputArray.userInput();

        int[] workArray = inputArray.randomInput(50);
        System.out.println("Array size - " + workArray.length);
        System.out.println("------");
//        System.out.println(workArray);
//        System.out.println(workArray[0]);
        printArray.arrayPrint("Our working array:", workArray);

        int sumOfArray = arrayOperationsExample.sumOfArrayElements(workArray);
        int minOfArray = arrayOperationsExample.minOfArrayElements(workArray);
        int maxOfArray = arrayOperationsExample.maxOfArrayElements(workArray);

        System.out.println("Sum of all elements our array is - " + sumOfArray);
        System.out.println("Min element of  our array is - " + minOfArray);
        System.out.println("Max element of  our array is - " + maxOfArray);

        printArray.arrayPrint("Our working array:", workArray);
        arrayOperationsExample.checkEvenElements(workArray);
        printArray.arrayPrint("-------------", workArray);

    }

}
