package lessons.lesson11.arraySortAndSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arrayForSearch = {8,3,5,2,1,4,7,6};

        int elementForSearch= 6;

        int indexSearch = linearSearch(arrayForSearch, elementForSearch);

        if (indexSearch>=0) {
            System.out.println("Search element "+ elementForSearch + " in the our array have index " + indexSearch);
        } else {
            System.out.println("Search element "+ elementForSearch + " didn't find in the our array");
        }

    }

    public static int linearSearch(int[] workingArray, int elementForSearch){
        for (int index = 0; index < workingArray.length; index++) {
            if (workingArray[index] == elementForSearch){
                return index;
            }
        }
        return -1;
    }
}
