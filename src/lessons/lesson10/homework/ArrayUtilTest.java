package lessons.lesson10.homework;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();

        //------- Test 1 ------
        int expectedResultArraySize = 5;
        int testArraySize = 5;

        int[] actualArray = au.createArray(testArraySize);

        if (expectedResultArraySize == actualArray.length) {
            System.out.println("Test 1 Create array is OK!");
        } else {
            System.out.println("Test 1 Create array is Fail!");
            System.out.println("Expected result " + expectedResultArraySize + ",but actual result is " + actualArray.length);

        }

    }
}
