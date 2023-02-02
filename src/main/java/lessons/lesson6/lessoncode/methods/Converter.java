package lessons.lesson6.lessoncode.methods;

public class Converter {

    public double converterCelsiumToKelvin(double temperaturaInCelsium){
        double temperaturaInKelvin = temperaturaInCelsium - 273.15;
        return temperaturaInKelvin;
    }

    public double converterCelsiumToFarengate(double temperaturaInCelsium){
        double temperaturaInFarengate = temperaturaInCelsium*1.8+32;
        return temperaturaInFarengate;
    }

    public void  printConverter(String messageC, double tempC, String messageA,  double tempAnother ) {
        System.out.println(messageC + tempC + messageA + tempAnother);

    }

}
