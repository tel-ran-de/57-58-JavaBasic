package lessons.lesson9.hardLevelEntity;

public class HardLeverEntity {
    public static void main(String[] args) {
        DataTopLevel dataTopLevel = new DataTopLevel();
        DataHighLevel dataHighLevel = new DataHighLevel();
        DataMiddleLevel dataMiddleLevel = new DataMiddleLevel();
        DataLowLevel dataLowLevel = new DataLowLevel();

        dataLowLevel.counter = 1;
        dataLowLevel.names[0] = "Ruslan";

        dataMiddleLevel.id = 1;
        dataMiddleLevel.label = "Super label";
        dataMiddleLevel.dataLowLevel = dataLowLevel;

        dataHighLevel.idHiLevel = 10;
        dataHighLevel.dataMiddleLevel = dataMiddleLevel;

        dataTopLevel.idTop = 100;
        dataTopLevel.dataHighLevel = dataHighLevel;


        System.out.println(dataTopLevel);

        System.out.println(dataTopLevel.dataHighLevel.dataMiddleLevel.dataLowLevel.names[0].length());

    }
}
