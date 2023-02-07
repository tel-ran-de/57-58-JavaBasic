package lessons.lesson11.constructorExample;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar1 = new Car();

        //----- блок получение данных от пользователя -----

        String model = "Mercedes";
        int engine = 350;
        boolean isElectric = false;

        String typeOfBody = "cabrio";


        // -------- создание экземпляра класса ---



        myCar1.model = model;
        myCar1.engine = engine;
        myCar1.isElectric = isElectric;


        //--------- создание и заполнение гаража ------


        CarSuper[] myGarage = new CarSuper[10];

        myGarage[0] = new CarSuper(model,typeOfBody,engine,isElectric);

        System.out.println(myGarage[0]);

        System.out.println(myGarage[0].model.length());
        System.out.println(myGarage[0].typeOfBody.length());




    }
}
