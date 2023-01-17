package lessons.lesson5;

public class Robot {

    String robotName;
    int model;
    boolean isPainter;

    public Robot() {
    }

    public Robot(String robotName, int model, boolean isPainter) {
        this.robotName = robotName;
        this.model = model;
        this.isPainter = isPainter;
    }

    public void hello(){
        System.out.println("Hello!");
    }

    public void greetings(){
        System.out.println("--------------");
        System.out.println("Hello! My name is " + robotName);
        System.out.println("My model number is " + model);
        System.out.println("I am " + isPainter + " good painter");
    }


}
