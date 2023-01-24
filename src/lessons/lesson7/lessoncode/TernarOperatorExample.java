package lessons.lesson7.lessoncode;

public class TernarOperatorExample {
    public static void main(String[] args) {

        System.out.println(checkNumber((20.0)));
        System.out.println(checkNumber((20.555)));

        System.out.println(checkNumber2((20.0)));
        System.out.println(checkNumber2((20.555)));



    }

    public static int checkNumber(double number){
        int checkMainPart = (int) (number); // если число = 10.0 => то результат 10
                                            // если например = 10.8 =>  то результат 10

        double ostatok = number - checkMainPart;

        System.out.println("ostatok = "+ostatok);

        if (ostatok == 0){
            return checkMainPart * checkMainPart;
        } else {return 0;}

    }

    public static int checkNumber2(double number){
        int checkMainPart = (int) (number); // если число = 10.0 => то результат 10
        // если например = 10.8 =>  то результат 10

        double ostatok = number - checkMainPart;

        System.out.println("ostatok = "+ostatok);

        int resultForReturn = ostatok == 0 ? checkMainPart*checkMainPart : 0;

        return resultForReturn;

    }

}
