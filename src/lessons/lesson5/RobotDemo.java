package lessons.lesson5;

public class RobotDemo {


    public static void main(String[] args) {
        Robot robotPetya = new Robot();

        System.out.println(robotPetya);

        robotPetya.robotName = "Petya";
        robotPetya.model = 25;
        robotPetya.isPainter = true;


        robotPetya.hello();
        robotPetya.greetings();

    }
}
