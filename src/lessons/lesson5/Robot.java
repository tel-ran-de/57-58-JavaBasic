package lessons.lesson5;

public class Robot {

    String robotName;
    int model;
    boolean isPainter;

    public Robot() {
    }

    public void hello(){
        System.out.println("Hello!");
    }

    public void greetings(){
        System.out.println("Hello! My name is " + robotName);
        System.out.println("My model number is " + model);
        System.out.println("I am " + isPainter + " good painter");
    }


}
