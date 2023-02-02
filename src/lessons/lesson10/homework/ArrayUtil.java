package lessons.lesson10.homework;

public class ArrayUtil {
    public int[] createArray(int arraySize){
        return new int[arraySize];
    }

    public  void fillArrayByRandomElements(int[] workingArray, int arrayRange){
        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = (int) (Math.random() * arrayRange);
        }
    }

    public void printArray(String message, int[] workingArray){
        System.out.println(message);

        int count = 0;

        for (int i = 0; i < workingArray.length; i++) {

            System.out.print(workingArray[i]+", ");
//            count++;
//            if (count % 10 == 0 ) {
//                System.out.println();
//            }
        }
        System.out.println();
    }

    public int[] changeOriginalArray(int[] workingArray){

        int[] newArray = new int[workingArray.length];

        for (int i = 0; i < newArray.length; i++) {
            if (i % 2 != 0) {
                newArray[i] = 0;
            } else {
                newArray[i] = workingArray[i];
            }
        }
        return newArray;
    }
}
