package lessons.lesson8.ObjectsArray;

import java.util.Arrays;

public class CatsArrayDemo {
    public static void main(String[] args) {
        CatsArrayUtil catsArrayUtil = new CatsArrayUtil();
        int numbersOfCat = 2;
        Cat[] myCats = catsArrayUtil.createCatsArray(numbersOfCat);

        System.out.println("----- create array ----");
        System.out.println(myCats);
        System.out.println(Arrays.toString(myCats));

        System.out.println("------fill array ---");
        System.out.println("please enter data for " + numbersOfCat + " cats");
        catsArrayUtil.fillCatsArray(myCats);
        System.out.println(myCats);
        System.out.println("---------");
        System.out.println(Arrays.toString(myCats));


        System.out.println("---------");
        System.out.println(myCats[0].name);
    }
}
