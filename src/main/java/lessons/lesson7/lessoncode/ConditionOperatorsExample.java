package lessons.lesson7.lessoncode;

public class ConditionOperatorsExample {
     /*
    Написать программу, которая запрашивает у пользователя
    три целых числа и выводит на консоль наибольшее из них.

    PS: перед решением этой задачи распишите на бумаге
    или в коментарии все возможные варианты (комбинации).
    Это поможет вам правильно написать программу!
    Нельзя пользоваться классом Math.

     */

    public static void main(String[] args) {

        ThreeNumbersCompare threeNumbersCompare = new ThreeNumbersCompare();

        double parameter1 = threeNumbersCompare.userInputNumbers("Please enter your first number ");
        double parameter2 = threeNumbersCompare.userInputNumbers("Please enter your second number ");
        double parameter3 = threeNumbersCompare.userInputNumbers("Please enter your third number ");

        double checkResult = threeNumbersCompare.compare(parameter1,parameter2,parameter3);

        threeNumbersCompare.printMsg("Maximum from your numbers is " + checkResult);

    }
}
