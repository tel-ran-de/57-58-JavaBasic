package lessons.lesson9.hardLevelEntity;

public class DataMiddleLevel {
    int id;
    String label;

    DataLowLevel dataLowLevel;

    @Override
    public String toString() {
        return "DataMiddleLevel{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", dataLowLevel=" + dataLowLevel +
                '}';
    }
}
