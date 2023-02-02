package lessons.lesson10.testExamples;

import java.util.Arrays;

public class Task1 {
/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и
сообщите индекс его последнего вхождения в массив.

- создание массива -> входные данные - количество элементов -> созданный массив
- заполнение массива случайными данными-> вход (ранее созданный массив, диапазон значений) -> выход (заполненный массив)
- поиск максимального элемента -> вход (ранее заполненный массив) -> выход (значение максимального элемента)
- поиск индекса последнего вхождения -> вход (массив и максимальный элемент) -> (выход - индекс)

 */

    public static void main(String[] args) {
        Task1Util tu = new Task1Util();
        InputData inputData = new InputData();

        // -- поступление от юзерского интерфейса

        int arraySize = inputData.arraySize();
        int startValue = inputData.startValue();
        int endValue = inputData.endValue();

        //-----------------------------------

        int[] workingArray = tu.fillArray(tu.createArray(arraySize),startValue, endValue );
        int maxElement = tu.findMaxElement(workingArray);
        int lastIndex = tu.findLastIndexOfMaxElement(workingArray,maxElement);

        System.out.println(Arrays.toString(workingArray));
        System.out.println("Our max array element is " + maxElement);
        System.out.println("Last index is " + lastIndex);

    }
}
