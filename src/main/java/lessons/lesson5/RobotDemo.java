package lessons.lesson5;

public class RobotDemo {


    public static void main(String[] args) {
        //  создаем экземпляр класса РОБОТс помощью дефолтного конструктора
        Robot robotPetya = new Robot();

        // печаем значение которое хранится в нашей переменной  -ссылка
        System.out.println(robotPetya);

        // записываем значение в поля экземпляра класса ПЕТЯ
        robotPetya.robotName = "Petya";
        robotPetya.model = 25;
        robotPetya.isPainter = true;

// обращаемся к методам  экземпляра класса ПЕТЯ
        robotPetya.hello();
        robotPetya.greetings();

        //  создаем экземпляр класса РОБОТ с помощью нашего конструктора
        Robot robotSiri = new Robot("Siri",5,false);

        //// обращаемся к методу  экземпляра класса SIRI
        robotSiri.greetings();

        // Менякм значение в переменной экземпляра класса
        robotSiri.model = 7;

        // обращаемся к методу  экземпляра класса SIRI
        robotSiri.greetings();

        robotPetya.speak("I am very glad to see you!");
        robotSiri.speak("Me too!");
        robotPetya.speak("I am so tired!");

        System.out.println(robotPetya.id);

        System.out.println(robotPetya.id.isEmpty());

    }
}
