package lessons.lesson8.ObjectsArray;

public class CatsArrayUtil {

    public Cat createCat(){
        InputData inputData = new InputData();

       String catName =  inputData.userInputText("Please enter cat name");
       String catColor =  inputData.userInputText("Please enter cat color");
       int catAge = inputData.userInputInt("Please enter cat age");

        return new Cat(catName, catColor, catAge);
    }

    public Cat[] createCatsArray(int arraySize){
        Cat[] catsArray = new Cat[arraySize];
        return catsArray;
    }

    public void fillCatsArray(Cat[] catsArray){
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i] = createCat();
        }
    }

}
