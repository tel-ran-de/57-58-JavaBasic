package lessons.lesson2;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double parametr1 = 25.5;
        double parametr2 = 5.0;

        // ---------- variant 1 -----------------

        double sumResult = calculator.sum(parametr1,parametr2);

        System.out.println("Sum result is " + sumResult);

        double subResult = calculator.sub(parametr1,parametr2);

        System.out.println("Sub result is " + subResult);

        double multiResult = calculator.multiplication(parametr1,parametr2);

        System.out.println("Multiplication result is " + multiResult);

        double divResult = calculator.div(parametr1,parametr2);

        System.out.println("Div result is " + divResult);

        System.out.println( " ----- variant 2 -------");

        //----------------------- variant 2 -------------------------

        calculator.print("Sum","Sum result is " + calculator.sum(parametr1,parametr2));
        calculator.print("Sub","Sub result is " + calculator.sub(parametr1,parametr2));
        calculator.print("Multiplication","Multiplication result is " + calculator.multiplication(parametr1,parametr2));
        calculator.print("Div","Div result is " + calculator.div(parametr1,parametr2));


    }
}
