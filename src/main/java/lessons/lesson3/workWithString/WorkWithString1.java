package lessons.lesson3.workWithString;

public class WorkWithString1 {
    public static void main(String[] args) {


        String textOriginal = "     Это текст для метод проверки работы методов типа String      ";
        String text = textOriginal;


        System.out.println(text);
        // ---- получение длины строки -----
        System.out.println("Text length is " + text.length());

        // ----- получаем ответ на вопрос содержит ли наша строка некую подстроку (набор символов) -----

        boolean resultContains = text.contains("рабо");

        System.out.println("Is text contains our substring -? " + resultContains);

        //-----  с какого индекса первое вхожденние подстроки -----

        System.out.println("index contains is - "+text.indexOf("рабо"));

        //---- перевод в верхний регистр ----

        String textUpperCase = text.toUpperCase();


        System.out.println(textUpperCase);

        // ---- перевод в нижний регистр -------
        System.out.println(text.toLowerCase());


        // ---- удаление пробелов с начала и конца -----
        text = text.trim();
//        System.out.println(text.trim());
        System.out.println(text.length());
        System.out.println(text);


        System.out.println("--------------------------");

        // -------  дает ответ на вопрос пустая ли строка

        String testEmpty = "";
        System.out.println(testEmpty.length());
        System.out.println(testEmpty.isEmpty());
        System.out.println(text.isEmpty());

        System.out.println("--------------------------");

        // ----- получение символов из строки ------

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(text.length()-1));

//----  получить часть нашей строки -----

        String substring1 = text.substring(44);
        System.out.println(substring1);

        String substring2 = text.substring(14, 32);
        System.out.println(substring2);


    }
}
