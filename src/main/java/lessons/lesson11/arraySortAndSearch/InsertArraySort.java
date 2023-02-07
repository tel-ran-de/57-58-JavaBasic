package lessons.lesson11.arraySortAndSearch;

import java.util.Arrays;

public class InsertArraySort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*
        {8,3,5,2,1,4,7,6}  - исходный массив
        {8,|| 3,5,2,1,4,7,6}
        {8,3,|| 5,2,1,4,7,6}
        {3,8,|| 5,2,1,4,7,6}
        {3,8,5,||2,1,4,7,6}
        {3,5,8,||2,1,4,7,6}
        {3,5,8,2,||1,4,7,6}
        {2,3,5,8,||1,4,7,6}
        {1,2,3,5,8,||4,7,6}
        {1,2,3,4,5,8,||7,6}
        {1,2,3,4,5,7,8,||6}
        {1,2,3,4,5,6,7,8}

        ----------------

         */


        System.out.println("Array before sort:");
        System.out.println(Arrays.toString(arrayForSort));
        insertSort(arrayForSort);
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(arrayForSort));

    }

    public static void insertSort(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println("Iteration " + i);
            System.out.println(Arrays.toString(workingArray));

           int currentElement = workingArray[i];
           int j = i-1;
           while ((j>=0) && (currentElement<workingArray[j])){
              workingArray[j+1] = workingArray[j];
              j--;
           }
           workingArray[j+1] = currentElement;
        }
    }
}
