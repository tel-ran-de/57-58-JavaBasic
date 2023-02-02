package lessons.lesson10.testExamples;

public class Task1Util {

    int[] createArray(int arraySize) {return new int[arraySize];}

    int[] fillArray(int[] arrayForFilling, int startValue, int endValue){
        for (int i = 0; i < arrayForFilling.length; i++) {
            arrayForFilling[i] = (int) ((startValue+Math.random()* (endValue-startValue+1)));
        }
        return arrayForFilling;
    }

    int findMaxElement(int[] workingArray){
        int maxElement = workingArray[0];
        for (int i = 1; i < workingArray.length ; i++) {
            if (maxElement < workingArray[i]) {
                maxElement = workingArray[i];
            }
        }
        return maxElement;
    }

    int findLastIndexOfMaxElement(int[] workingArray, int maxElement){
        int searchIndex = workingArray.length-1;

        for (int i = workingArray.length-1; i >=0 ; i--) {
            if (workingArray[i] == maxElement) {
                searchIndex = i;
                break;
            }
        }
        return searchIndex;
    }

}
