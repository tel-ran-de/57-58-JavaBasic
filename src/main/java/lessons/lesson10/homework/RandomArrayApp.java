package lessons.lesson10.homework;

import org.w3c.dom.ls.LSOutput;

public class RandomArrayApp {
    public static void main(String[] args) {
        /*
        1. Получить размер массива
        2. Получить диапазон чисел
        3. Создать новый массив нужного размера
        4. Заполнить массив случайными числами из заданного диапазона
        5. Вывести информацию пользователю
         */


//        UserInterface ui = new UserInterface();
//        boolean checkInput = true;
//
//        while (checkInput) {
//            int arraySize = ui.userIntInput("Please enter numbers of your array elements - ");
//            if ((arraySize > 0) && (arraySize <= 8)) {
//                checkInput = false;
//            } else {
//                System.out.println("Wrong array size number! ");
//            }
//        }

        ArrayUtil au = new ArrayUtil();

        int arraySize = 8;
        int arrayRange = 50;

        int[] workingArray = au.createArray(arraySize);
        au.fillArrayByRandomElements(workingArray, arrayRange);
        au.printArray("Printing array with random data",workingArray);

        int[] arrayAfterChange = au.changeOriginalArray(workingArray);
        au.printArray("Printing array after change data",arrayAfterChange);


    }
}
