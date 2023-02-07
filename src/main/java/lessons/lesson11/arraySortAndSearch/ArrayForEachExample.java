package lessons.lesson11.arraySortAndSearch;

public class ArrayForEachExample {
    public static void main(String[] args) {
        String[] stringArray = { "white", "black", "grey"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        System.out.println("--------------");

        for (String tempString : stringArray) {
            System.out.println(tempString);
        }
    }
}
