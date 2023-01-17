package lessons.lesson5.workWithString;

public class WorkWithString2 {
    public static void main(String[] args) {



        String text = "  Это текст для проверки работы методов типа String  ";


        System.out.println("Our working text is -> "+text);

        String  testString1 = "рабо";

        boolean resultContains = text.contains(testString1);

        System.out.println("Contains result is - " + resultContains);

        System.out.println("Contains word 'Pert' result is - " + text.contains("Pert"));

        String textAfterUpperCase = text.toUpperCase();

        System.out.println(textAfterUpperCase);
        String textAfterLowerCase = text.toLowerCase();

        System.out.println(textAfterLowerCase);


        text = text.trim();

        System.out.println(text);

        System.out.println(text.indexOf("метод "));

        System.out.println(text.replaceAll("о","а"));





    }
}
