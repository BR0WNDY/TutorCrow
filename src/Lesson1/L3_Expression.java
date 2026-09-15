package Lesson1;

public class L3_Expression {
    public static void main() {
        System.out.println("Hi");
        // number + - * /
        int myFirstNumber = 20;
        int mySecondNumber = 40;

        int plusResult = myFirstNumber + mySecondNumber;
        System.out.println("+ result = " + plusResult);
        // Using Variables
        int minusResult = myFirstNumber - mySecondNumber;
        System.out.println("- result = " + minusResult);

        // not using variables (direct method)
        System.out.println("- result (again) = "+(mySecondNumber - myFirstNumber));

        int multiplyResult = myFirstNumber * mySecondNumber;
        System.out.println("* result = " +multiplyResult);

        double divideResult = myFirstNumber / 2;
        System.out.println("/ result = " +divideResult);

       // String +
        String name1 = "Mango";
        String name2 = "Super";
//        String space = " ";
        System.out.println(name2 + " " + name1);




    }
}
