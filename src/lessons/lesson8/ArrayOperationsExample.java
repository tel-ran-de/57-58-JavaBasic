package lessons.lesson8;

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

}
