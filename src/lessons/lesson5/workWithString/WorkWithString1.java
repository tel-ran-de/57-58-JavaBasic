package lessons.lesson5.workWithString;

public class WorkWithString1 {
    public static void main(String[] args) {

        String str1 = "       ";

        String text = "Это текст для проверки работы методов типа String";
        String text1 = "";

        char simbol1 = text.charAt(0);


        System.out.println(simbol1);
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

  //      System.out.println(text.charAt(49));

        String subStringText1 = text.substring(40);

        String subStringText2 = text.substring(0,10);

        System.out.println(subStringText1);
        System.out.println(subStringText2);

        System.out.println(subStringText2 + " -> " +subStringText1);


    }
}
