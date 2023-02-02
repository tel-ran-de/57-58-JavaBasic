package lessons.lesson10.homework3;

public class Task3 {
    public static void main(String[] args) {

        int[] array  = {1,2,3,5,6,7,8,9,10,0};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};


        int n = array.length;
        int summaAllElements = n * (n+1) /2;

        int summaWithoutOneElement=0;

        for (int i = 0; i <array.length ; i++) {
            summaWithoutOneElement = summaWithoutOneElement + array[i];
        }

        int missingElement = summaAllElements - summaWithoutOneElement;

        System.out.println("Missing element - " + missingElement);

        int misEl = 0;

        for (int i = 0; i < array.length; i++) {
            if ((i+1) != array[i]) {
                misEl = i+1;
                break;
            }
        }
        System.out.println("Missing element - " + misEl);


    }
}
