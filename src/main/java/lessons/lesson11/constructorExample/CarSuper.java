package lessons.lesson11.constructorExample;

public class CarSuper {
    String model;

    String typeOfBody;
    int engine;

    boolean isElectric;

    public CarSuper(String model, String typeOfBody, int engine, boolean isElectric) {
        this.model = model;
        this.typeOfBody = typeOfBody;
        this.engine = engine;
        this.isElectric = isElectric;
    }

    public CarSuper(String model, int engine, boolean isElectric) {
        this.model = model;
        this.engine = engine;
        this.isElectric = isElectric;
    }

    public CarSuper(int engine, String typeOfBody, boolean isElectric) {
        this.typeOfBody = typeOfBody;
        this.engine = engine;
        this.isElectric = isElectric;
    }


    public CarSuper(String model, int engine) {
        this.model = model;
        this.engine = engine;
    }

    public CarSuper(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "CarSuper{" +
                "model='" + model + '\'' +
                ", typeOfBody='" + typeOfBody + '\'' +
                ", engine=" + engine +
                ", isElectric=" + isElectric +
                '}';
    }
}
