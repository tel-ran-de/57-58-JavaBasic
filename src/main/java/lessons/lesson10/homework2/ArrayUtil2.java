package lessons.lesson10.homework2;

public class ArrayUtil2 {


    public int[] createArray(int arraySize){
        return new int[arraySize];
    }
    public  void fillArrayByRandomElements(int[] workingArray, int arrayRangeStart, int arrayRangeEnd){
        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = (int) (arrayRangeStart + Math.random() * (arrayRangeEnd - arrayRangeStart +1));
            // когда рандом = 0 то значение нашего элемента должно быть равно началу нашего диапазона
            // когда рандом = 1 -> то значение нашего элемента должно быть равно концу нашего диапазона
            // началоДиапазона + (рандом)* ( КонецДиапазона - НачалоДиапазона)
            // Начальный Диапазон = 10
            // Конец Диапазона = 99

            //граничные условия = рандом = 0 -> значение будет равно = 10 = 10 + 0 * ( 99 -10 +1)
            // рандом = 0,9999 -> значение будет равно 10 + 0,9999 * (99 -10 + 1) = 10 + 0,9999 * 90
            // = 10 + 89,991 = 99,991 -> (int) 99,991 = 99

        }
    }

    public void printArray(String message, int[] workingArray){
        System.out.println(message);



        for (int i = 0; i < workingArray.length; i++) {

            System.out.print(workingArray[i]+", ");

        }
        System.out.println();
    }


    public boolean isArrayGrow(int[] workingArray){
        boolean checkResult = true;

        for (int i = 1; i < workingArray.length; i++) {
            if(workingArray[i] < workingArray[i-1]) {
                checkResult = false;
                break;
            }
        }

        return checkResult;
    }


}
