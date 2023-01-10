package lessons.lesson3.workWithString;

public class WorkWithString3 {
    public static void main(String[] args) {



//--------------------------- сравнение строк ----------------------------

        int a = 5;
        int b = 10;

        System.out.println(a==b);

        System.out.println("Java"=="Java");

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "JAVA";

        System.out.println("---- compare with '==' ---");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str3==str4);

        System.out.println("---- compare with .equals ---");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str3.equals(str4));



    }
}
