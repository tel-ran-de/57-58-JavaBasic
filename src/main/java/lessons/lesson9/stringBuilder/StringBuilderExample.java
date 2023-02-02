package lessons.lesson9.stringBuilder;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder stringBuffer = new StringBuilder();
        StringBuilder stringBuffer1 = new StringBuilder("Something data");

        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        stringBuffer.append(new Integer(2));
        stringBuffer.append("; ");
        stringBuffer.append(true);
        stringBuffer.append("; ");
        stringBuffer.append(Arrays.asList(1,2,3));


        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());

    }
}
