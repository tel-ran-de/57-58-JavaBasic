package lessons.lesson10.homework4;

public class Pizza {
    public static void main(String[] args) {

        int diameterPizza1 = 24;
        int diameterPizza2 = 28;
        int calories = 40;

        Double area1 = circleArea(diameterPizza1);
        Double area2 = circleArea(diameterPizza2);

        System.out.println("Calories differance is " + (int) ((area2-area1)*calories));



    }

    public static double circleArea(int diameter){
        return (diameter*diameter/4)*Math.PI;
    }
}
