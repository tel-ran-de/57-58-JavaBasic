package lessons.lesson2;

public class Calculator {

    public double sum (double x, double y){

        double result = x + y;

        return result;
    }

    public double sub (double x, double y){
        double resultSub = x - y;
        return  resultSub;
    }

    public double multiplication (double x, double y){
        double resultMultipl = x * y;
        return  resultMultipl;
    }

    public double div (double x, double y){
        double resultDiv = x / y;
        return  resultDiv;
    }

    public void print(String task, String message) {
        System.out.println("Our task is - " + task);
        System.out.println(message);
        System.out.println("----------------------------");
    }

}
