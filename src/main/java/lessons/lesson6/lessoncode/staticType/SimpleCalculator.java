package lessons.lesson6.lessoncode.staticType;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.println(sum(3,7));
        System.out.println(sum(13,17));
        System.out.println(sum(23,37));
        System.out.println(sum(33,71));
        System.out.println(sum(34,72));


    }

    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }


}
