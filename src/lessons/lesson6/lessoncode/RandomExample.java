package lessons.lesson6.lessoncode;

public class RandomExample {
    public static void main(String[] args) {
        /*
            Math.random() *  (max - min + 1) + min
         */
        double random1 =  Math.random() *  (50 - 10 + 1) + 10;

        double random2 =  Math.random() *  (100 - 0 + 1) + 0;
        double random3 =  Math.random() *  (150 - 120 + 1) + 120;
        double random4 =  Math.random() *  (1000 - 550 + 1) + 550;
        double random5 =  Math.random() *  (1000000 - 150000 + 1) + 150000;



        System.out.println("1st random example : "+ Math.round(random1) );
        System.out.println("2st random example : "+ Math.round(random2)  );
        System.out.println("3st random example : "+ Math.round(random3) );
        System.out.println("4st random example : "+ Math.round(random4) );
        System.out.println("5st random example : "+ Math.round(random5) );
    }
}
