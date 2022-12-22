package lessons.lesson2;

public class Car {

    String model;

    double engin;

    String color;

    Boolean transmissionAutomat;

    Trunk trunk;

    public void beep(){
        System.out.println("This is " + model + " ! BEEP!");
        //System.out.println(textMessage);
    }

    public void go(){
        String textMessage = "Start engine ";
        System.out.println(textMessage+engin);
    }

    public void stop(){

    }


}
