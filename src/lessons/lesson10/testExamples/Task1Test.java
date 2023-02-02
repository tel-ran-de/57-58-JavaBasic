package lessons.lesson10.testExamples;

public class Task1Test {

    /*
    на что мы делаем тесты???
    1) правильность создания массива
    2) поиск максимального элемента
    3) поиск индекса последнего вхожджения
     */

    public static void main(String[] args) {
        Task1Util tu = new Task1Util();
        InputData id = new InputData();

        int arraySize = id.arraySize();

        // --------- TEST 1 Create array ------

        int[] expectedArray = new int[12];

        int[] actualArray = tu.createArray(arraySize);

        printTestResult("Create array",expectedArray.length, actualArray.length);

        //------------ Test 2.1 --------

        int[] testArray = {100, -5, -9, 1, 26, 3, 9, 87, 43, -50 , 54 ,25};
        int expectedMaxElement = 100;
        int actualMaxElement = tu.findMaxElement(testArray);
        printTestResult("Find max element 0 index ", expectedMaxElement, actualMaxElement);

        //------------ Test 2.1 --------

        testArray = new int[] {0, -5, -9, 1, 26, 3, 9, 87, 43, -50 , 54 ,100};
        expectedMaxElement = 100;
        actualMaxElement = tu.findMaxElement(testArray);
        printTestResult("Find max element 11 index ", expectedMaxElement, actualMaxElement);

        //------------ Test 3.1 ---------

        testArray =  new int[] {100, -5, -9, 1, 26, 3, 9, 87, 43, -50 , 54 ,25};
        int expectedIndex = 0;
        int actualIndex = tu.findLastIndexOfMaxElement(testArray, actualMaxElement);
        printTestResult("Find 0 index ", expectedIndex, actualIndex);

//------------ Test 3.2 ---------

        testArray =  new int[] {0, -5, -9, 1, 26, 3, 9, 87, 43, -50 , 54 ,100};
        expectedIndex = 11;
        actualIndex = tu.findLastIndexOfMaxElement(testArray, actualMaxElement);
        printTestResult("Find 11 index ", expectedIndex, actualIndex);

//------------ Test 3.3 ---------

        testArray =  new int[] {0, -5, -9, 1, 26, 3, 100, 87, 43, -50 , 54 ,25};
        expectedIndex = 6;
        actualIndex = tu.findLastIndexOfMaxElement(testArray, actualMaxElement);
        printTestResult("Find 6 index ", expectedIndex, actualIndex);



    }

    public static void printTestResult(String message, int expectedResult, int realResult){
        if (expectedResult == realResult) {
            System.out.println("Test " + message + " passed OK!");
        } else {
            System.out.println("Test " + message + " passed FAIL!");
            System.out.println("Expected result - "+ expectedResult + " but received - "+realResult);
        }
    }

}
