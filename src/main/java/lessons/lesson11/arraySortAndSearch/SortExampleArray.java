package lessons.lesson11.arraySortAndSearch;

import java.util.Arrays;
import java.util.Collections;

public class SortExampleArray {

    public static void main(String[] args) {

        // создаем массив целых чисел
        int[] intArray = {76,43,245,87,240,2355625};

        //вывод на консоль

        System.out.println(Arrays.toString(intArray));
        // сортировка массива по возрастанию - изменение превоначального массива
        Arrays.sort(intArray);
        //вывод на консоль массива после сортировки
        System.out.println(Arrays.toString(intArray));


        // создаем массив строк
        String[] stringArray =  {"Maxim",  "Alex", "Daria", "Amex", "Amal"};

        //вывод на консоль

        System.out.println(Arrays.toString(stringArray));
        // сортировка массива по возрастанию - изменение превоначального массива
        Arrays.sort(stringArray);
        //вывод на консоль массива после сортировки
        System.out.println(Arrays.toString(stringArray));

        // сортировка массива в обратном порядке
        Arrays.sort(stringArray, Collections.reverseOrder());
        //вывод на консоль массива после сортировки
        System.out.println(Arrays.toString(stringArray));
    }
}
