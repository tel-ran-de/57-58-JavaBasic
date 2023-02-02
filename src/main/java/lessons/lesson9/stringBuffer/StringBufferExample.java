package lessons.lesson9.stringBuffer;

import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("Something data");

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
