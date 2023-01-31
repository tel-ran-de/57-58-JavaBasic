package lessons.lesson9.hardLevelEntity;

import java.util.Arrays;

public class DataLowLevel {
    String[] names = new String[5];

    int counter;

    @Override
    public String toString() {
        return "DataLowLevel{" +
                "names=" + Arrays.toString(names) +
                ", counter=" + counter +
                '}';
    }
}
