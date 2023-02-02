package lessons.lesson3;

public class CalcDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sum = calculator.sum(5,25);

        System.out.println("sum - " + sum);

        System.out.println("multiplication - " + calculator.multiplication(5,25));


    }
}
