package lessons.lesson7.lessoncode;

import java.util.Random;

public class LoopForExample {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            int calculatorResult;

            if (i % 2 == 0) {
                calculatorResult = i * i * random.nextInt(100);
            } else {
                calculatorResult = i * i * random.nextInt(1000);
            }
            System.out.println("i = " + i + "  random = " + calculatorResult);
        }
    }
}
