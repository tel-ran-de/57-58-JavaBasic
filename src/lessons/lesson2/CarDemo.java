package lessons.lesson2;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Trunk newTrunk = new Trunk();
        CarModificator carModificator = new CarModificator();

        newTrunk.model = "X125";
        newTrunk.size = 30;


        myCar1.model = "Mercedes";
        myCar1.engin = 2.5;
        myCar1.color  = "Black";
        myCar1.trunk = newTrunk;
        myCar1.transmissionAutomat = true;

        Car car2 = new Car();
        car2.model = "BMW";
        car2.engin = 3;
        car2.color = "White";
        car2.transmissionAutomat = false;
        car2.trunk = newTrunk;

        System.out.println(myCar1.model);
        myCar1.beep();

        System.out.println(car2.model);
        car2.beep();

       //---------------------------

        System.out.println(car2.model);
        carModificator.modificatorCarName(car2);
        System.out.println(car2.model);



    }
}
