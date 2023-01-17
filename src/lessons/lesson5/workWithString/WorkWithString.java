package lessons.lesson5.workWithString;

public class WorkWithString {
    public static void main(String[] args) {

        String str1 = "       ";

        String text = "Это текст для проверки работы методов типа String";
        String text1 = "";

        System.out.println(text);

        int myStringLength = text.length();

        System.out.println(text.length());


        boolean isMyStringEmpty= str1.isEmpty();

        System.out.println(str1.isBlank());
        System.out.println(str1.isEmpty());


        System.out.println(text1.isBlank());
        System.out.println(text1.isEmpty());

        System.out.println(text.isEmpty());




    }
}
