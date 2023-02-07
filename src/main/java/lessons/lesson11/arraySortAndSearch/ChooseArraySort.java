package lessons.lesson11.arraySortAndSearch;

import java.util.Arrays;

public class ChooseArraySort {
    public static void main(String[] args) {

        int[] arrayForSort = {8,3,5,2,1,4,7,6};
        /*

        ----------- сортировка правой части - поиск минимального элемента-----------

        {8,3,5,2,1,4,7,6}  - исходный массив
        {8,|| 3,5,2,1,4,7,6}
        {1,|| 3,5,2,8,4,7,6}
        {1,3,||5,2,8,4,7,6}
        {1,2,|| 5,3,8,4,7,6}
        {1,2,5,||3,8,4,7,6}
        {1,2,3,|| 5,8,4,7,6}
        {1,2,3,5,||8,4,7,6}
        {1,2,3,4,||8,5,7,6}
        {1,2,3,4,8,||5,7,6}
        {1,2,3,4,5,||8,7,6}
        {1,2,3,4,5,8,||7,6}
        {1,2,3,4,5,6,||7,8}
        {1,2,3,4,5,6,7,||8}

        {1,2,3,4,5,6,7,8}

        ----------------

         */


        System.out.println("Array before sort:");
        System.out.println(Arrays.toString(arrayForSort));
        System.out.println("--------------------------");
        chooseSort(arrayForSort);
        System.out.println("--------------------------");
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(arrayForSort));

    }

    public static void chooseSort(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            System.out.println("Итерация "+i);
            System.out.println(Arrays.toString(workingArray));
         int min = workingArray[i];
         int minId = i;
            for (int j = i+1; j < workingArray.length ; j++) {
                if (workingArray[j] < min) {
                    min = workingArray[j];
                    minId = j;
                }
            }

            System.out.println(i +  " element -" + workingArray[i] +  " will change " + minId + " index " +min +  " value");
            int temp = workingArray[i];
            workingArray[i] = min;
            workingArray[minId] = temp;
        }
    }
}
