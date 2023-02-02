package lessons.lesson6.lessoncode.conditionOperators;

import java.util.Scanner;

public class ConditionsOperators3 {
    public static void main(String[] args) {

      boolean isRain = false;
      boolean isSun = true;

      if (isSun && !isRain) {
          System.out.println("Идем гулять без зонта");
      } else {
          System.out.println("Сидим дома");
      }

//        boolean noRain = true;
//
//
//        if (isSun && noRain) {
//            System.out.println("Идем гулять без зонта");
//        } else {
//            System.out.println("Сидим дома");
//        }



        boolean isCloud = false;


      if (isRain) {
          System.out.println("Сидим дома");
      } else if (isSun && !isCloud) {
          System.out.println("Идем гулять без зонта");
      } else {
          System.out.println("Идем гулять c зонтиком");}



      if (isSun && !isRain && !isCloud) {System.out.println("Идем гулять без зонта");}
      if (isSun && !isRain && isCloud) {System.out.println("Идем гулять c зонтиком");}
      if (isRain) {System.out.println("Сидим дома");}


    }

}
