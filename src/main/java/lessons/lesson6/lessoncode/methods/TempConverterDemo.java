package lessons.lesson6.lessoncode.methods;

public class TempConverterDemo {

    public static void main(String[] args) {
        Converter converter = new Converter();

        Double tempL = ( (int  ) (100*converter.converterCelsiumToKelvin(21)))/100.0;

        converter.printConverter("Convert temp from ", 21," Celsium in Kelvin is ",tempL);

        converter.printConverter("Convert temp from ", 21," Celsium in Farengate is ", converter.converterCelsiumToFarengate(21));


    }
}
